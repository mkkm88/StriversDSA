package BinarySearch;

public class FirstAndLastOccurrence {
    public static int lastOccurrence(int[] arr, int n, int target) {
        int low = 0;
        int high = n-1;
        int last = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                last = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return last;
    }
    public static int firstOccurrence(int[] arr, int n, int target) {
        int low = 0;
        int high = n-1;
        int first = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                first = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return first;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,13,13,13,20,40};
        int n = arr.length;
        int target = 13;

        int last = lastOccurrence(arr, n, target);
        int first = firstOccurrence(arr, n, target);
        System.out.println(first + " " + last);
    }
}
