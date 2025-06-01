package Arrays.Easy.FifthQues;

import java.util.Arrays;

public class LeftRotateArrayByOne {
    public static void leftRotateByOne(int[] arr) {
        // 1nd Method - TC => O(N) | SC => O(1)
        int n = arr.length;
        /*int k = arr[0];
        for (int i=0; i<n-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[n-1] = k;
        for (int j : arr) {
            System.out.print(j + " ");
        }*/


        // 2nd Method - TC => O(N) | SC => O(N)
        // we use an extra array here to left shift
        int[] temp = new int[n];
        //if (n - 1 >= 0) System.arraycopy(arr, 1, temp, 0, n - 1);
        for (int i=1; i<n; i++) {
            temp[i-1] = arr[i];
        }
        temp[n-1] = arr[0];
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        leftRotateByOne(arr);
    }
}
