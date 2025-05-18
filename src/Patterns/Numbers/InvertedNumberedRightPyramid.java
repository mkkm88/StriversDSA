package Patterns.Numbers;

public class InvertedNumberedRightPyramid {
    public static void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(n-j+1+" ");
            }
            System.out.println();
        }

        /*for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }*/
    }
    public static void main(String[] args) {
        int n = 6;
        pattern6(n);
    }
}