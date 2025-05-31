package Arrays.Easy.FifthQues;

import java.util.Arrays;

public class LeftRotateArrayByOne {
    public static void leftRotateByOne(int[] arr) {
        int n = arr.length;
        int k = arr[0];
        for (int i=0; i<n-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[n-1] = k;
        System.out.println(Arrays.toString(arr));

/*
        int[] temp = new int[n];
        int n = arr.length;
        for (int i=1; i<n; i++) {
            temp[i-1] = arr[i];
        }
        temp[n-1] = arr[0];
        System.out.println(Arrays.toString(arr));*/
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        leftRotateByOne(arr);
    }
}
