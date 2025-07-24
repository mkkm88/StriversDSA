package BinarySearch;

public class ImplementLowerBound {
    public static int lowerBound(int[] arr, int x) {
        int n = arr.length;
        for (int i=0; i<n; i++) {
            if (arr[i] >= x) {
                return i;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int[] arr = {3,5,8,15,19};
        int x = 51;

        int ans = lowerBound(arr, x);
        System.out.println(ans);
    }
}
