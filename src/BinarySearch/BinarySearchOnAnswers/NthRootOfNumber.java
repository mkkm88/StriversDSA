package BinarySearch.BinarySearchOnAnswers;

public class NthRootOfNumber {
    public static int func(int i, int n) {
        int ans = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                ans = ans * i;
                n = n-1;
            } else {
                i = i * i;
                n = n / 2;
            }
        }
        return ans;
    }
    public static int rootOfnumber(int n, int m) {
        for (int i=1; i<m; i++) {
            if (func(i, n) == m) return i;
            else if (func(i, n) > m) {
                break;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 3; int m = 69;
        int result = 1;

        int ans = rootOfnumber(n, m);
        System.out.println(ans);
    }
}
