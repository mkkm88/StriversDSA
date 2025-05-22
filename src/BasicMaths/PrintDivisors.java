package BasicMaths;

import java.util.Scanner;

public class PrintDivisors {
    public static int[] printDivisors(int num, int[] size) {
        int[] divisors = new int[num];
        int count = 0;
        double sqrt = Math.sqrt(num);
        for (int i = 1; i <= sqrt; i++) {
            if (num % i == 0) {
               divisors[count++] = i;
            }
        }
        size[0] = count;
        return divisors;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();
        int[] size = new int[1];
        int[] divisors = printDivisors(num, size);
        System.out.print("Divisors of " + num + " are : ");
        for (int i = 0; i < size[0]; i++) {
            System.out.print(divisors[i] + " ");
        }
        System.out.println();
    }
}
