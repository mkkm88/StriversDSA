package LeetCode;

import java.util.Arrays;

public class ThreeSumClosest {
    public static int threeSumClosest(int[] arr, int n, int target) {
        int closest = Integer.MAX_VALUE;
        int result = 0;
        Arrays.sort(arr);

        for (int i=0; i<n; i++) {
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (Math.abs(sum - target) < closest) {
                    closest = Math.abs(sum - target);
                    result = sum;
                }
                if (sum < target) j++;
                else k--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {-1,2,1,-4};
        int n = arr.length;
        int target = 1;

        int ans = threeSumClosest(arr, n, target);
        System.out.print(ans);
    }
}
