package BasicMaths;

import java.util.Scanner;

public class CountDigits {
    public static void countDigit(long num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        System.out.println("Number of digits are : " + count);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of test cases : ");
        int testcase = scanner.nextInt();
        for (int i = 0; i < testcase; i++ ) {
            System.out.print("Enter the value of test case " + (i+1) + " : " );
            long num = scanner.nextLong();
            countDigit(num);
        }
    }
}
