package Recursion;

import java.util.Scanner;

public class SumOfN {
    public static void sumOfNNumbers(int n) {
        /*int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }*/
        int sum = n*(n+1)/2;
        System.out.print("The sum of first " + n + " numbers is : " + sum);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();

        sumOfNNumbers(num);
    }
}
