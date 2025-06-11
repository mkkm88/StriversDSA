package CodingNinjas;

import java.util.Arrays;

public class SumOfMinMaxElements {
    public static int sumOfMinMax(int[] arr, int n) {
        /*int min = arr[0];
        int max = arr[0];

        for (int i=1; i<n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }*/

        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[n-1];
        return (min + max);
    }
    public static void main(String[] args) {
        int[] arr = {-1, -4, 5, 8, 9, 3};
        int n = arr.length;

        int ans = sumOfMinMax(arr, n);
        System.out.println(ans);
    }
}
