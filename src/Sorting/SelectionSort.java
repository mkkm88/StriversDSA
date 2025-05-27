package Sorting;


import java.util.Scanner;

public class SelectionSort {
    public static void selectionSorting(int[] arr, int n) {
        for (int i=0; i<=n-2; i++) {
            int min = i;
            for (int j=i; j<=n-1; j++) {
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }

        selectionSorting(arr, n);
        for (int i=0; i<n; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
