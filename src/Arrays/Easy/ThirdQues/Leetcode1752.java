package Arrays.Easy.ThirdQues;

public class Leetcode1752 {
    public static boolean isSorted(int[] nums) {
        int n = nums.length;

        // construct the rotated array
        int[] checkSorted = new int[n];

        // Iterate through all possible rotation offset
        for (int rotationOffset = 0; rotationOffset < n; rotationOffset++) {
            int currIndex = 0;
            for (int index = rotationOffset; index < n; index++) {
                checkSorted[currIndex++] = nums[index];
            }
            for (int index = 0; index < rotationOffset; index++) {
                checkSorted[currIndex++] = nums[index];
            }

            // Check if the constructed array is sorted
            boolean isSorted = true;
            for (int index = 0; index < n-1; index++) {
                if (checkSorted[index] > checkSorted[index+1]) {
                    isSorted = false;
                    break;
                }
            }

            // if sorted, return true
            if (isSorted) {
                return true;
            }
        }

        // If no rotation makes the array sorted, return false
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,3,4,5,6,7};
        System.out.println(isSorted(nums));
    }
}
