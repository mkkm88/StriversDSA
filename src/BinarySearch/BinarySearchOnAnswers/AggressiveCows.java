package BinarySearch.BinarySearchOnAnswers;

import java.util.Arrays;

public class AggressiveCows {
    public static boolean canWePlace(int[] stalls, int distance, int cows) {
        int countCows = 1;
        int lastCow = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastCow >= distance) {
                countCows++;
                lastCow = stalls[i];
            }
            if (countCows >= cows) return true;
        }
        return false;
    }
    public static int aggressiveCows(int[] arr, int cows) {
        int n = arr.length;
        Arrays.sort(arr);
        /*int limit = arr[n-1] - arr[0];
        for (int i=1; i<=limit; i++) {
            if (!canWePlace(arr, i, cows)) return (i-1);
        }
        return limit;*/

        int low = 0; int high = arr[n-1] - arr[0];
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canWePlace(arr, mid, cows)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }
    public static void main(String[] args) {
        int[] arr = {0,3,4,7,10,9};
        int cows = 4;

        int result = aggressiveCows(arr, cows);
        System.out.println("The maximum possible minimum distance is: " + result);
    }
}
