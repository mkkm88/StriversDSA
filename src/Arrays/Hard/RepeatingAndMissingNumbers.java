package Arrays.Hard;

import java.util.Arrays;

public class RepeatingAndMissingNumbers {
    public static int[] repeatingAndMissing(int[] arr, int n) {
        int[] hash = new int[n+1];

        for (int i=0; i<n; i++) {
            hash[arr[i]]++;
        }

        int repeating = -1; int missing = -1;
        for (int i=1; i<= n; i++) {
            if (hash[i] == 2) repeating = i;
            else if (hash[i] == 0) missing = i;

            if (repeating != -1 && missing != -1) break;
        }
        return new int[]{repeating, missing};
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,3};
        int n = arr.length;

        int[] ans = repeatingAndMissing(arr, n);
        System.out.println(Arrays.toString(ans));
    }
}
