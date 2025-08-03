package BinarySearch.BinarySearchOnAnswers;

public class NthRootOfNumber {
    // return 1 if == m
    // return 0 if < m
    // return 2 if > m
    public static int func(int n, int mid, int m) {
        long  ans = 1;
        for (int i=1; i<=n; i++) {
            ans = ans * mid;
            if (ans > m) return 2;
        }
        if (ans == m) return 1;
        return 0;
    }
    public static int rootOfnumber(int n, int m) {
        /*for (int i=1; i<m; i++) {
            if (func(i, n) == m) return i;
            else if (func(i, n) > m) {
                break;
            }
        }
        return -1;*/

        int low = 1; int high = m;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (func(n, mid, m) == 1) return mid;
            else if (func(n, mid, m) == 0) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 3; int m = 27;
        int result = 1;

        int ans = rootOfnumber(n, m);
        System.out.println(ans);
    }
}
