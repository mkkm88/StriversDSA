package Arrays.Hard;

public class MaxProductSubArray {
    public static int maxProductSubArray(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        for (int i=0; i<n; i++) {
            int prod = 1;
            for (int j=i+1; j<n; j++) {
                prod *= arr[j];
                max = Math.max(max, prod);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,0,4,5,7};
        int n = arr.length;

        int ans = maxProductSubArray(arr, n);
        System.out.print(ans);
    }
}
