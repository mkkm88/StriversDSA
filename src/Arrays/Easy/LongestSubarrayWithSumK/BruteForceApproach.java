package Arrays.Easy.LongestSubarrayWithSumK;

public class BruteForceApproach {
    public static int longestSubArray(int[] arr, int n, long k) {
        int len = 0;
        for (int i=0; i<n; i++) {
            for (int j=i; j<n; j++) {
                long s = 0;
                for (int K=i; K <= j; K++) {
                    s += arr[K];
                }
                if (s == k) {
                    len = Math.max(len, j-i+1);
                }
            }
        }
        return len;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,9};
        int n = arr.length;
        long k = 10;


        int ans = longestSubArray(arr, n, k);
        System.out.println("Length of longest sub array that sums to k is : " + ans);
    }
}
