package BinarySearch;

public class SearchInRotatedSortedArray {
    public static int searchElement(int[] arr, int n, int target) {
        int low = 0;
        int high = n-1;
        int result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target)
                return mid;

            // if left part is sorted
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && target <= arr[mid]) {
                    high = mid - 1; // element exists
                } else {
                    low = mid + 1;  // element does not exist
                }
            } else {   // if right part is sorted
                if (arr[mid] <= target && target <= arr[high]) {
                    low = mid + 1;   // element exists
                } else {
                    high = mid - 1;   // element does not exist
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9,10,0,1,2,3};
        int n = arr.length;
        int target = 11;

        int ans = searchElement(arr, n, target);
        if (ans == -1)
            System.out.println("Target is not present.");
        else
            System.out.println("The index is: " + ans);
    }
}
