package Recursion;

import java.util.Scanner;

public class SumOfN {
    public static int sumOfNNumbers(int n) {
        // 1st Method : using the loop
        /*int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }*/

        // 2nd Method : using the formula
        /*int sum = n*(n+1)/2;
        System.out.print("The sum of first " + n + " numbers is : " + sum);*/

        // 3rd Method : using parameterized recursion
        /*if (n < 1) {
            System.out.print("The sum of numbers is : " + sum);
            return;
        }
        sumOfNNumbers(n-1, sum+n);*/

        // 4th Method : using functional recursion
        if (n == 0) return 0;
        return n + sumOfNNumbers(n-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();

        System.out.println("The sum of first " + num + " numbers is : " + sumOfNNumbers(num));
    }
}
