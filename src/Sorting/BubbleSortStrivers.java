package Sorting;

import java.util.Scanner;

public class BubbleSortStrivers {
    public static void bubbleSort(int[] arr, int n) {
        for (int i=n-1; i>=0; i--) {
            int didSwap = 0;
            for (int j=0; j<=i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    didSwap = 1;
                }
            }
            if (didSwap == 0) {
                break;
            }
            System.out.print("runs\n");
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

        bubbleSort(arr, n);
        System.out.print("The sorted array is : ");
        for (int i=0; i<n; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
