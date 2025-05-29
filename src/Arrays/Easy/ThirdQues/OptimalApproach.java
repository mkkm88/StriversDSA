package Arrays.Easy.ThirdQues;

import java.util.Arrays;

public class OptimalApproach {
    public static boolean isSorted(int[] arr, int n) {
        for (int i=1; i<n; i++) {
            if (arr[i] < arr[i-1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,5};
        int n = arr.length;

        System.out.println(isSorted(arr, n));
    }
}
