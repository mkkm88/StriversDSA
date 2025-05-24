package Recursion;

public class ReverseArrayRecursively {
    public static void reverseArray(int[] arr, int start, int end) {
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
    }
    public static void main(String[] args) {
        int n = 10;
        int[] arr = {100,90,80,70,60,50,40,30,20,10};
        reverseArray(arr, 0, n-1);
        printArray(arr, n);
    }
}
