package BasicMaths;

import java.util.Scanner;

public class CheckPrime {
    public static boolean checkPrime(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return (count == 2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();

        System.out.println(checkPrime(num));
    }
}
