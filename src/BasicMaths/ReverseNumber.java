package BasicMaths;

import java.util.Scanner;

public class ReverseNumber {
    public static void reverseNumber(long num) {
        int revNum = 0;
        while (num > 0) {
            int lastDigit = (int) (num % 10);
            revNum = (revNum * 10) + lastDigit;
            num = num / 10;
        }
        System.out.println("Reverse number is : " + revNum);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of test cases : ");
        int testcase = scanner.nextInt();
        for (int i = 0; i < testcase; i++ ) {
            System.out.print("Enter the value of test case " + (i+1) + " : " );
            long num = scanner.nextLong();
            reverseNumber(num);
        }
    }
}
