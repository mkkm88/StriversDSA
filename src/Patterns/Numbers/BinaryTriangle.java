package Patterns.Numbers;

public class BinaryTriangle {
    public static void pattern11(int n) {
        // 1st Method (Shradha)
        /*for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }*/

        // 2nd Method (Strivers)

        int start = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) start = 1;
            else start = 0;

            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start = 1-start;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        pattern11(n);
    }
}
