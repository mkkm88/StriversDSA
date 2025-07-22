package Arrays.Hard;

import java.util.Arrays;

public class RepeatingAndMissingNumbers {
    public static int[] repeatingAndMissing(int[] arr, int n) {
        int repeating = -1;
        int missing = -1;

        for (int i=1; i<=n; i++) {
            int count = 0;
            for (int j=0; j<n; j++) {
                if (arr[j] == i) {
                    count++;
                }
            }
            if (count == 2) repeating = i;
            else if (count == 0) {
                missing = i;
            }

            if (repeating != -1 && missing != -1) break;
        }
        return new int[]{repeating, missing};
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2,5,4,6,7,5};
        int n = arr.length;

        int[] ans = repeatingAndMissing(arr, n);
        System.out.println(Arrays.toString(ans));
    }
}
