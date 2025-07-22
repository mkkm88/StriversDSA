package Arrays.Hard;
import java.util.Arrays;

public class RepeatingAndMissingNumbers {
    public static int[] repeatingAndMissing(int[] arr, int n) {
        /*int[] hash = new int[n+1];

        for (int i=0; i<n; i++) {
            hash[arr[i]]++;
        }

        int repeating = -1; int missing = -1;
        for (int i=1; i<= n; i++) {
            if (hash[i] == 2) repeating = i;
            else if (hash[i] == 0) missing = i;

            if (repeating != -1 && missing != -1) break;
        }
        return new int[]{repeating, missing};*/

        long SN = ((long) n *(n+1)) / 2;
        long S2N = ((long) n * (n+1) *(2L *n+1)) / 6;
        long S = 0;
        long S2 = 0;

        for (int i=0; i<n; i++) {
            S += arr[i];
            S2 += (long) arr[i] * (long) arr[i];
        }

        long val1 = S - SN;
        long val2 = S2 - S2N;

        val2 = val2 / val1;

        long x = (val1 + val2) / 2;
        long y = x - val1;

        return new int[]{(int) x, (int) y};
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2,5,3};
        int n = arr.length;

        int[] ans = repeatingAndMissing(arr, n);
        System.out.println(Arrays.toString(ans));
    }
}
