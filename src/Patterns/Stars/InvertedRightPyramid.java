package Patterns.Stars;

public class InvertedRightPyramid {
    public static void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 6;
        pattern5(n);
    }
}
