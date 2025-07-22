package LeetCode;

public class ThreeSumClosest {
    public static int threeSumClosest(int[] arr, int n, int target) {
        int closest = arr[0] + arr[1] + arr[2];
        int result = Integer.MAX_VALUE;

        for (int i=0; i<n-2; i++) {
            for (int j=i+1; j<n-1; j++) {
                for (int k=j+1; k<n; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if (Math.abs(sum - target) < closest) {
                        closest = Math.abs(sum - target);
                        result = sum;
                    }
                }
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
