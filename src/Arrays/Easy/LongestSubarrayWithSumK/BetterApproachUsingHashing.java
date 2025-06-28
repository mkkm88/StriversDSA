package Arrays.Easy.LongestSubarrayWithSumK;

import java.util.HashMap;

public class BetterApproachUsingHashing {
    public static int getLongestSubarray(int[] arr, int n, long k) {
        HashMap<Long, Integer> preSumMap = new HashMap<>();

        long sum = 0;
        int maxLen = 0;
        for (int i=0; i<n; i++) {
            // calculate the prefix sum till index i
            sum += arr[i];
            // if the sum = k, update the maxLen
            if (sum == k) {
                maxLen = Math.max(maxLen, i+1);
            }
            // calculate the sum of remaining part i.e. x-k
            long rem = sum - k;
            // calculate the length and update maxLen
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            // finally, update the map checking the condition
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,9};
        int n = arr.length;
        long k = 10;

        int len = getLongestSubarray(arr, n, k);
        System.out.println(len);
    }
}
