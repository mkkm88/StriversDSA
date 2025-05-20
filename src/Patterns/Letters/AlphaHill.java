package Patterns.Letters;

public class AlphaHill {
    public static void pattern17(int n) {
        for (int i = 0; i < n; i++) {
            // spaces -> before letters
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }

            // letters
            char ch = 'A';
            int breakpoint = (2*i+1)/2;
            for (int j = 1; j <= 2*i+1; j++) {
                System.out.print(ch);
                if (j <= breakpoint) ch++;
                else ch --;
            }

            // spaces -> after letters
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 9;
        pattern17(n);
    }
}
