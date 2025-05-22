package BasicMaths;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintDivisorOptimal {
    public static ArrayList<Integer> findDivisors(int num) {
        ArrayList<Integer> divisors = new ArrayList<>();

        int sqrtN = (int) Math.sqrt(num);

        for (int i = 1; i <= sqrtN; i++) {
            if (num % i == 0) {
                divisors.add(i);
                if (i != num / i) {
                    divisors.add(num / i);
                }
            }
        }
        return divisors;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = scanner.nextInt();

        ArrayList<Integer> divisors = findDivisors(number);

        System.out.print("Divisors of " + number + " are: ");
        for (int divisor : divisors) {
            System.out.print(divisor + " ");
        }
        System.out.println();
    }
}
