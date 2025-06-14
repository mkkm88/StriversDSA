package Arrays.Easy.LongestSubarrayWithSumK;

public class UsingTwoLoops {
    public static int getLongestSubarray(int[] arr, int n, long k) {
        int len = 0;
        for (int i=0; i<n; i++) {
            long s = 0;
            for (int j=i; j<n; j++) {
                s += arr[j];
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

        int len = getLongestSubarray(arr, n, k);
        System.out.println(len);
    }
}
