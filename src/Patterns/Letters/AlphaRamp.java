package Patterns.Letters;

public class AlphaRamp {
    public static void pattern16(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                char letter = (char) ('A' + i);
                System.out.print(letter + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 7;
        pattern16(n);
    }
}
