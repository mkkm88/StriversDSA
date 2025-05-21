package Patterns.Numbers;

import java.util.Scanner;

public class SolidRectangleNumber {
    public static void pattern22(int n) {
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                // Initialising the top, down, left and right indices of a cell.
                int bottom = (2*n - 2) - i;
                int right = (2*n - 2) - j;
                System.out.print(n - Math.min(Math.min(i,bottom), Math.min(j,right)) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of test cases : ");
        int testCase = scanner.nextInt();
        for (int i = 0; i < testCase; i++ ) {
            System.out.print("Enter the value of test case " + (i+1) + " : " );
            int n = scanner.nextInt();
            pattern22(n);
        }
    }
}
