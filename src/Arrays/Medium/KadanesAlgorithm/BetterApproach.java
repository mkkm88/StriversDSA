package Arrays.Medium.KadanesAlgorithm;

public class BetterApproach {
    public static long maximumSubArraySum(int[] arr, int n) {
        long maxSum = Long.MIN_VALUE;

        for (int i=0; i<n; i++) {
            int sum = 0;
            for (int j=i; j<n; j++) {
                sum += arr[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {-2, 1, 2, -1};
        int n = arr.length;

        long maxSum = maximumSubArraySum(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);
    }
}
