package Recursion;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayRecursively {
    // Recursion Method
    /*public static void reverseArray(int[] arr, int start, int end) {
        if (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverseArray(arr, start+1, end-1);
        }
    }
    public static void printArray(int[] arr, int n) {
        System.out.print("Reversed array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }
    } */


    // Using in-built library
    public static void reverseArray(Integer[] arr) {
        Collections.reverse(Arrays.asList(arr));
    }
    public static void printArray(Integer[] arr, int n) {
        System.out.print("Reversed array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args) {
        int n = 10;
        Integer[] arr = {0,1,2,3,4,5,6,7,8,9};
        reverseArray(arr);
        printArray(arr, n);
    }
}
