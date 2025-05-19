package Patterns.Numbers;

public class NumberCrown {
    public static void pattern12(int n) {
        // 1st Method (Shradha)
        /*for (int i = 1; i <= n; i++) {
            // 1st Number Triangle
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // spaces
            for (int j = i+1; j <= 2*n-i; j++) {
                System.out.print(" ");
            }
            // 2nd Number Triangle
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }*/


        // 2nd Method (Strivers)
        int spaces = 2*(n-1);
        for(int i=1;i<=n;i++){
            // for printing numbers in each row
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            // for printing spaces in each row
            for(int j = 1;j<=spaces;j++){
                System.out.print(" ");
            }
            // for printing numbers in each row
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            System.out.println();
            spaces-=2;
        }
    }
    public static void main(String[] args) {
        int n = 5;
        pattern12(n);
    }
}
