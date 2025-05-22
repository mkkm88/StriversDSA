package BasicMaths;

import java.util.Scanner;

public class CheckPalindrome {
    public static boolean palindrome(int num) {
        int dup = num;
        int revNum = 0;
        while (num > 0) {
            revNum = (revNum * 10) + num % 10;
            num = num / 10;
        }
        return revNum == dup;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of test cases : ");
        int testcase = scanner.nextInt();
        for (int i = 0; i < testcase; i++ ) {
            System.out.print("Enter the value of test case " + (i+1) + " : " );
            int num = scanner.nextInt();
            System.out.println(palindrome(num));
        }
    }
}
