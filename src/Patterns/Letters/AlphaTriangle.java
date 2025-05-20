package Patterns.Letters;

public class AlphaTriangle {
    public static void pattern18(int n) {
        // 1st Method (Kasim)
        /*for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (ch+n-i));
                ch++;
            }
            System.out.println();
        }*/

        // 2nd Method (Strivers)
        for(int i=0;i<n;i++) {
            // A+n-1-i (i is row no.) to A+n-1 (E in this case).
            for (char ch = (char) ('A'+n-1-i); ch <= (char) ('A'+n-1); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        pattern18(n);
    }
}
