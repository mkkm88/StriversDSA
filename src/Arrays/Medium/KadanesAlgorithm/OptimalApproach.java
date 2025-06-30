package Arrays.Medium.KadanesAlgorithm;

public class OptimalApproach {
    public static long maximumSubArraySum(int[] arr, int n) {
        long maxSum = Long.MIN_VALUE;
        long sum = 0;

        int start = 0;
        int ansStart = -1, ansEnd = -1;
        for (int i=0; i<n; i++) {
            if (sum == 0) start = i;
            sum += arr[i];

            if (sum > maxSum) {
                maxSum = sum;

                ansStart = start;
                ansEnd = i;
            }

            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.print("The subArray is : [");
        for (int i=ansStart; i<=ansEnd; i++) {
            System.out.print(" " + arr[i] + " ");
        }
        System.out.print("]\n");
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {-2, 1, 2, -1};
        int n = arr.length;

        long maxSum = maximumSubArraySum(arr, n);
        System.out.println("The maximum subArray sum is: " + maxSum);
    }
}
