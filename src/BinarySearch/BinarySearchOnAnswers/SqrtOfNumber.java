package BinarySearch.BinarySearchOnAnswers;

public class SqrtOfNumber {
    public static void main(String[] args) {
        int n = 40;
        /*System.out.println((int)Math.sqrt(n));*/

        // Brute Force Approach
        int ans = 1;
        /*for (int i=1; i<=n; i++) {
            if (i * i <= n) {
                ans = i;
            } else {
                break;
            }
        }
        System.out.println(ans);*/

        // Optimal Approach -> Binary search

        int low = 0; int high = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            if ((mid * mid) <= n) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
