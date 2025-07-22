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

        /*long SN = ((long) n *(n+1)) / 2;
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

        return new int[]{(int) x, (int) y};*/


        int xr = 0;
        //Step 1: Find XOR of all elements:
        for (int i = 0; i < n; i++) {
            xr = xr ^ arr[i];
            xr = xr ^ (i + 1);
        }

        //Step 2: Find the differentiating bit number:
        int number = (xr & ~(xr - 1));

        //Step 3: Group the numbers:
        int zero = 0;
        int one = 0;
        for (int i = 0; i < n; i++) {
            //part of 1 group:
            if ((arr[i] & number) != 0) {
                one = one ^ arr[i];
            }
            //part of 0 group:
            else {
                zero = zero ^ arr[i];
            }
        }

        for (int i = 1; i <= n; i++) {
            //part of 1 group:
            if ((i & number) != 0) {
                one = one ^ i;
            }
            //part of 0 group:
            else {
                zero = zero ^ i;
            }
        }

        // Last step: Identify the numbers:
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == zero) cnt++;
        }

        if (cnt == 2) return new int[] {zero, one};
        return new int[] {one, zero};
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2,5,3};
        int n = arr.length;

        int[] ans = repeatingAndMissing(arr, n);
        System.out.println(Arrays.toString(ans));
    }
}
