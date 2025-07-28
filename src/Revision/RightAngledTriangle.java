package Revision;

public class RightAngledTriangle {
    public static void main(String[] args) {
        int n = 5;

        // print stars pyramid
        /*for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/

        // print numbers pyramid - I
        /*for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }*/

        // print numbers pyramid - II
        /*for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }*/


        // print inverted stars pyramid
         /*for (int i=1; i<=n; i++) {
             for (int j = n; j >= i; j--) {
                 System.out.print("* ");
             }
             System.out.println();
         }*/

        // print inverted numbers pyramid - I
        /*for (int i=1; i<=n; i++) {
            for (int j=1; j<=n-i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }*/

        // print full star pyramid
       /* for (int i=1; i<=n; i++) {
            // print spaces
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            // print spaces
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }*/

        // print full inverted stars pyramid
        /*for (int i=n; i>=1; i--) {
            // print spaces
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            // print spaces
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }*/


        // print stars pyramid
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // print inverted stars pyramid
        for (int i=1; i<=n; i++) {
             for (int j = n; j >= i; j--) {
                 System.out.print("* ");
             }
             System.out.println();
        }

    }
}
