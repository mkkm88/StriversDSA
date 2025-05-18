package Patterns.Stars;

public class RAInvertedHalfPyramid {
    public static void pattern5(int n) {
        // 1st Method (shradha)
        /*for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }*/

        // 2nd Method (Strivers)
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
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
