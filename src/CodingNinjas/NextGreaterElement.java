package CodingNinjas;

import java.util.Arrays;

public class NextGreaterElement {
    public static int[] nextGreaterElement(int[] arr, int n) {
        int[] NGE = new int[n];
        for (int i=0; i<n-1; i++) {
            for (int j=i+1; j<n; j++) {
                if (arr[i] < arr[j]) {
                    NGE[i] = arr[j];
                    break;
                }
                NGE[i] = -1;
            }
        }
        NGE[n-1] = -1;
        return NGE;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,3,4,2};
        int n = arr.length;

        int[] ans = nextGreaterElement(arr, n);
        System.out.print(Arrays.toString(ans));
    }
}
