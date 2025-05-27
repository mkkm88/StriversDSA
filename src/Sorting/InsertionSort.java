package Sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void insertionSorting(int[] arr, int n) {
        for (int i=0; i<=n-1; i++) {
            int j = i;
            while (j > 0 && arr[j-1] > arr[j]) {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("The array elements are : ");
        for (int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }

        insertionSorting(arr, n);
        System.out.print("The sorted array : ");
        for (int i=0; i<n; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
