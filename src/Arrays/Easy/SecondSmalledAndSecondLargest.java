package Arrays.Easy;

import java.util.Arrays;

public class SecondSmalledAndSecondLargest {
    public static void getElements(int[] arr, int n) {
        if (n == 0 || n == 1 || n == 2) {
            System.out.print(-1);
            System.out.print(" ");
            System.out.print(-1);
            System.out.print("\n");
            return;
        }
        Arrays.sort(arr);
        int small = arr[1];
        int large = arr[n-2];
        System.out.println("Second smallest is : " + small);
        System.out.print("Second largest is : " + large);
    }
    public static void main(String[] args) {
        int[] arr = {4,1,6,2,8,9,6,5};
        int n = arr.length;
        getElements(arr, n);
    }
}
