package Recursion;

import java.util.Scanner;

public class PrintNTo1Backtracking {
    public static void printName(int i, int n) {
        // Base case
        if (i > n) return;
        printName(i+1, n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scanner.nextInt();

        printName(1, num);
    }
}
