package Arrays.Hard;

import java.util.Arrays;

public class ThirdMax {
    public static int getElements(int[] arr, int n) {
        Arrays.sort(arr);
        int count = 1;
        for (int i=n-2; i>=0; i--) {
            if (arr[i] != arr[i+1]) count++;
            if (count == 3) return arr[i];
        }
        return arr[n-1];
    }
    public static void main(String[] args) {
        int[] arr = {2,1,4,4,3,5,4,5};
        int n = arr.length;
        int result = getElements(arr, n);
        System.out.println(result);
    }
}
