package Patterns.Letters;

public class IncreasingLettersTriangle {
    public static void pattern14(int n) {
        // 1st Method (Kasim)
        /*char[] chars = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(chars[j]);
            }
            System.out.println();
        }*/

        // 2nd Method (Strivers)
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A'+i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 3;
        pattern14(n);
    }
}
