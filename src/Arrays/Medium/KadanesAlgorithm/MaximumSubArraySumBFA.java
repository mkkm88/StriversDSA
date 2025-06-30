package Arrays.Medium.KadanesAlgorithm;

public class MaximumSubArraySumBFA {
    public static int maximumSubArraySum(int[] arr, int n) {
        int maxSum = Integer.MIN_VALUE;
        for (int i=0; i<n; i++) {
            int sum = 0;
            for (int j=i; j<n; j++) {
                sum += arr[j];
                maxSum = Math.max(maxSum, sum);
            }
        }g
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;

        int ans = maximumSubArraySum(arr, n);
        System.out.println(ans);
    }
}
