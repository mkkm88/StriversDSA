package BasicMaths;

import java.util.Scanner;

public class CheckArmstrong {
    public static boolean isArmstrong(int n) {
        int armstrong = 0;
        int dup = n;
        int count = String.valueOf(n).length();
        while (n > 0) {
            int lastDigit = n % 10;
            armstrong += (int) Math.pow(lastDigit, count);
            n = n / 10;
        }
        return armstrong == dup;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();
        if (isArmstrong(num)) {
            System.out.println(num + " is an armstrong number");
        } else {
            System.out.println(num + " is not an armstrong number");
        }
    }
}
