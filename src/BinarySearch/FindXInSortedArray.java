package BinarySearch;

public class FindXInSortedArray {
    public static int binarySearch(int[] arr, int target) {
        int n = arr.length;
        int low = 0;
        int high = n-1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,6,7,9,12,16,17};
        int target = 12;

        int ans = binarySearch(arr, target);
        if (ans != -1) {
            System.out.println("Tha target found at index : " + ans);
        } else {
            System.out.println("The target number does not exists in the array ");
        }
    }
}
