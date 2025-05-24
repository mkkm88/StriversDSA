package Recursion;

import java.util.Scanner;

public class PrintFactorial {
    public static int factorialOfN(int n) {
        if (n == 0) return 1;

        return n * factorialOfN(n-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();

        System.out.print("The factorial of " + num + " is : " + factorialOfN(num));
    }
}
