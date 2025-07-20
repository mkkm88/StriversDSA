package Arrays.Hard;

import java.util.HashMap;

public class LengthLargestSubArrayWithSumZero {
    public static int lengthLargestSubArrayWithSumZero(int[] arr, int n) {
        int count  = 0;
        /*for (int i=0; i<n; i++) {
            int sum = 0;
            for (int j=i; j<n; j++) {
                sum += arr[j];
                if (sum == 0) {
                    count = Math.max(count, j-i+1);
                }
            }
        }*/

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i=0; i<n; i++) {
            sum += arr[i];
            if (sum == 0) {
                count = i+1;
            } else {
                if (map.get(sum) != null) {
                    count = Math.max(count, i - map.get(sum));
                } else {
                    map.put(sum, i);
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, -2, 4, -4};
        int n = arr.length;
        System.out.print("Length of largest subArray with sum 0 is : " + lengthLargestSubArrayWithSumZero(arr, n));
    }
}
