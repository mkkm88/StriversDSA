package Recursion;

import java.util.Scanner;

public class Print1ToN {
    public static void printName(int i, int n) {
        // Base case
        if (i > n) return;
        System.out.println(i);
        printName(i+1, n);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scanner.nextInt();

        printName(1, num);
    }
}
