package Patterns.Numbers;

public class IncreasingNumTriangle {
    public static void pattern13(int n) {
        int start = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(start+ " ");
                start = 1 + start;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 10;
        pattern13(n);
    }
}
