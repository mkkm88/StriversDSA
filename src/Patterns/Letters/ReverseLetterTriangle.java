package Patterns.Letters;

public class ReverseLetterTriangle {
    public static void pattern15(int n) {
        /*for (int i = n; i > 0; i--) {
            for (char ch = 'A'; ch < 'A'+i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }*/

        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <='A'+(n-i-1); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 3;
        pattern15(n);
    }
}
