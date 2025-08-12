package BinarySearch.BinarySearchOnAnswers;

public class KthMissingPositiveNumber {
    public static int findKthMissingPositive(int[] arr, int k) {
        /*for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= k) k++;
            else break;
        }
        return k;*/

        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int missing  = arr[mid] - (mid + 1);
            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high + k + 1;
    }
    public static void main(String[] args) {
        int[] arr = {4,7,9,10};
        int k = 4;

        int result = findKthMissingPositive(arr, k);
        System.out.println("The " + k + "th missing number is : " + result);
    }
}
