package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstLastOccurrence {
    public static int firstOccurrence(ArrayList<Integer> arr, int n, int k) {
        int low = 0;
        int high = n - 1;
        int starting = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == k) {
                starting = mid;
                high = mid - 1;
            } else if (arr.get(mid) < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return starting;
    }

    public static int lastOccurrence(ArrayList<Integer> arr, int n, int k) {
        int low = 0;
        int high = n - 1;
        int ending = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == k) {
                ending = mid;
                low = mid + 1;
            } else if (arr.get(mid) < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ending;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2,2,3,3,3,3,3,3,5));
        int n = arr.size();
        int k = 3;

        int start = firstOccurrence(arr, n, k);
        int end = lastOccurrence(arr, n, k);

        System.out.println(start + " " +  end);
    }
}
