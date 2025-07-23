package BinarySearch;

public class FindXInSortedArray {
    public static int search(int[] arr, int low, int high, int target) {
        if (low > high) return -1;

        int mid = (low + high) / 2;
        if (arr[mid] == target) return mid;
        else if (arr[mid] > target) {
            return search(arr, low, mid -1, target);
        }
        return search(arr, mid+1, high, target);
    }
    public static int binarySearch(int[] arr, int target) {
        int n = arr.length;
        /*int low = 0;
        int high = n-1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return -1;*/

        return search(arr, 0, n-1, target);
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,9,12,16,17};
        int target = 3;

        int ans = binarySearch(arr, target);
        if (ans != -1) {
            System.out.println("Tha target found at index : " + ans);
        } else {
            System.out.println("The target number does not exists in the array ");
        }
    }
}
