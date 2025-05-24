package Recursion;

public class ReverseArray {
    public static void reverseArray(int[] arr, int n) {
        int size = arr.length - 1;
        /*int[] newArr = new int[n];
        for (int i = 0; i <= size; i++) {
            newArr[i] = arr[size - i];
        }
        printArray(newArr, n);*/

        for (int i = 0; i <= n/2; i++, size--) {
            int temp = arr[i];
            arr[i] = arr[size];
            arr[size] = temp;
        }
        printArray(arr, n);
    }

    public static void printArray(int[] newArr, int n) {
        System.out.print("Reversed array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(newArr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1,2,3,4,5};
        reverseArray(arr, n);
    }
}
