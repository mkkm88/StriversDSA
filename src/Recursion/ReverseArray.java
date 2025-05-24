package Recursion;

public class ReverseArray {
    public static void reverseArray(int[] arr, int n) {
        int size = arr.length - 1;
        int[] newArr = new int[n];
        for (int i = 0; i <= size; i++) {
            newArr[i] = arr[size - i];
        }
        printArray(newArr, n);
    }

    public static void printArray(int[] newArr, int n) {
        System.out.print("Reversed array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(newArr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {10,50,20,60,30};
        reverseArray(arr, n);
    }
}
