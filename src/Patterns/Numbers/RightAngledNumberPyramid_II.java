package Patterns.Numbers;

public class RightAngledNumberPyramid_II {
    public static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 6;
        pattern3(n);
    }
}
