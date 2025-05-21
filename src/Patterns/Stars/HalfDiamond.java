package Patterns.Stars;

public class HalfDiamond {
    public static void pattern10(int n) {
        // 1st Method (Shradha)
        /*for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }*/

        // 2nd Method (Strivers)
        for(int i = 1; i <= 2*n-1; i++){
            int stars = i;
            if(i > n) stars = 2*n-i;

            for(int j = 1; j <= stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int n = 6;
        pattern10(n);
    }
}
