package Hashing;

import java.util.Scanner;

public class IntegerHashing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        // input
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // pre-compute
        int[] hash = new int[13];
        for (int i=0; i<size; i++) {
            hash[arr[i]] += 1;
        }

        System.out.print("Enter the query length : ");
        int q = scanner.nextInt();
        while (q-- != 0) {
            int num = scanner.nextInt();
            // fetching
            System.out.println("The number found " + hash[num] + " times");
        }
    }
}
