package BasicMaths;

import java.util.Scanner;

public class GCD {
    public static int gcdNumbers(int num1, int num2) {
        // Brute-Force Approach
        /*int gcd = 1;
        int minNumber = Integer.min(num1, num2);
        for (int i = 1; i <= minNumber; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;*/

        // Better Approach
        /*int minNumber = Integer.min(num1, num2);
        for (int i = minNumber; i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                return i;
            }
        }
        return 1;*/

        // Optimal Approach
        while (num1 > 0 && num2 > 0) {
            if (num1 > num2) num1 = num1 % num2;
            else num2 = num2 % num1;
        }
        if (num1 == 0) return num2;
        return num1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number : ");
        int num2 = scanner.nextInt();
        System.out.println("The GCD of " + num1 + " & " + num2 + " is : " + gcdNumbers(num1, num2));
    }
}
