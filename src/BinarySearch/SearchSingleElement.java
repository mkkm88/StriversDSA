package BinarySearch;
import java.util.*;

public class SearchSingleElement {
    public static int singleNonDuplicate(ArrayList<Integer> arr) {
        int n = arr.size(); // Size of the array.

        // Brute Force Approach - I

        /*if (n == 1)
            return arr.getFirst();

        for (int i = 0; i < n; i++) {
            // Check for first index:
            if (i == 0) {
                if (!arr.get(i).equals(arr.get(i + 1)))
                    return arr.get(i);
            }
            // Check for last index:
            else if (i == n - 1) {
                if (!arr.get(i).equals(arr.get(i - 1)))
                    return arr.get(i);
            } else {
                if (!arr.get(i).equals(arr.get(i - 1)) && !arr.get(i).equals(arr.get(i + 1)))
                    return arr.get(i);
            }
        }
        return -1;*/

        // Brute Force Approach - II (Using XOR)

       /* int ans = 0;
        for (Integer integer : arr) {
            ans = ans ^ integer;
        }
        return ans;*/

        // Optimal Approach (Binary Search)

        if (!arr.get(0).equals(arr.get(1))) return arr.get(0);
        if (!arr.get(n-1).equals(arr.get(n-2))) return arr.get(n-1);

        int low = 1; int high = n-2;

        if (n == 1) return arr.get(0);

        while (low <= high) {
            int mid = (low + high) / 2;

            if (!arr.get(mid).equals(arr.get(mid-1)) && !arr.get(mid).equals(arr.get(mid+1))) {
                return arr.get(mid);
            }

            if ((mid % 2 == 1 && arr.get(mid).equals(arr.get(mid-1))) || (mid % 2 == 0 && arr.get(mid).equals(arr.get(mid+1)))) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr =
                new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 5, 5, 6, 6));
        int ans = singleNonDuplicate(arr);
        System.out.println("The single element is: " + ans);
    }
}
