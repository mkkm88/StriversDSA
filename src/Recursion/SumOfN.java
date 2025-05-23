package Recursion;

import java.util.Scanner;

public class SumOfN {
    public static void sumOfNNumbers(int n, int sum) {
        // 1st Method : using the loop
        /*int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }*/

        // 2nd Method : using the formula
        /*int sum = n*(n+1)/2;
        System.out.print("The sum of first " + n + " numbers is : " + sum);*/

        // 3rd Method : using recursion
        if (n < 1) {
            System.out.print("The sum of numbers is : " + sum);
            return;
        }
        sumOfNNumbers(n-1, sum+n);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();

        sumOfNNumbers(num, 0);
    }
}
