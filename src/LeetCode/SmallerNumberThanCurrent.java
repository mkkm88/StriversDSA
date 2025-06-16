package LeetCode;

public class SmallerNumberThanCurrent {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int count  = 0;
        int[] res = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            for(int j = 0; j<nums.length; j++) {
                if (nums[j] < nums[i]) {
                    count++;
                }
            }
            res[i] = count;
            count = 0;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};

        int[] ans = smallerNumbersThanCurrent(arr);
        System.out.println(ans);
    }
}
