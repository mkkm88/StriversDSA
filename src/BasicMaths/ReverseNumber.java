package BasicMaths;

import java.util.Scanner;

public class ReverseNumber {
    public static int reverseNumber(int num) {
        int revNum = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            if (revNum > Integer.MAX_VALUE / 10 || revNum < Integer.MIN_VALUE / 10) {
                return 0;
            } else {
                revNum = (revNum * 10) + lastDigit;
                num = num / 10;
            }
        }
       return revNum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of test cases : ");
        int testcase = scanner.nextInt();
        for (int i = 0; i < testcase; i++ ) {
            System.out.print("Enter the value of test case " + (i+1) + " : " );
            int num = scanner.nextInt();
            int result = reverseNumber(num);
            System.out.println("Reverse number is : " + result);
        }
    }
}
