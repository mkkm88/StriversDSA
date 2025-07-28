package BinarySearch;

public class CountArrayRotation {
    public static int countArrayRotation(int[] arr, int n) {
        int ans = Integer.MAX_VALUE;
        int index = -1;
        /*for (int i=0; i<n; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
                index = i;
            }
        }
        return index;*/

        int low = 0; int high = n-1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[low] <= high) {
                if (arr[low] < ans) {
                    ans = arr[low];
                    index = low;
                }
            }

            if (arr[low] <= arr[mid]) {
                if (arr[low] < ans) {
                    ans = arr[low];
                    index = low;
                }
                low = mid + 1;
            } else {
                if (arr[mid] < ans) {
                    index = mid;
                    ans = arr[mid];
                }
                high = mid - 1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        int n = arr.length;

        int result = countArrayRotation(arr, n);
        System.out.println("The array is rotated " + result + " times.");
    }
}
