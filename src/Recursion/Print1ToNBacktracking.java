package Recursion;

import java.util.Scanner;

public class Print1ToNBacktracking {
    public static void printName(int i, int n) {
        // Base case
        if (i < 1) return;

        printName(i-1, n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scanner.nextInt();

        printName(num, num);
    }
}
