package Arrays.Easy.SixthQues;

import java.util.Scanner;

public class RotateByK {
    public static void Reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotateByK(int[] arr, int k, int n) {
        Reverse(arr, 0, n-k-1);   // Reverse first n-k elements
        Reverse(arr, n-k, n-1);   // Reverse last k elements
        Reverse(arr, 0, n-1);     // Reverse whole array
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rotations : ");
        int k = scanner.nextInt();

        int[] arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        rotateByK(arr, k , n);
        System.out.print("After Rotating the " + k + " elements to right : ");
        for (int j : arr) System.out.print(j + " ");
    }
}