package BinarySearch.BinarySearchOnAnswers;

public class SmallestDivisorGivenThreshold {
    public static int sumOfD(int[] arr, int div) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += (int) Math.ceil((double) (arr[i]) / (double) (div));
        }
        return sum;
    }
    public static int smallestDivisor(int[] arr, int threshold) {
        if (arr.length > threshold) return -1;
        int maxi = Integer.MIN_VALUE;
        for (int i=0; i < arr.length; i++) {
            maxi = Math.max(maxi, arr[i]);
        }

        /*for (int d = 1; d <= maxi ; d++) {
            int sum = 0;
            for (int j : arr) {
                sum += (int) Math.ceil((double) j / (double) d);
            }
            if (sum <= threshold) {
                return d;
            }
        }
        return -1;*/

        int low = 0; int high = maxi;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (sumOfD(arr, mid) <= threshold) {
                high = mid - 1;
            } else  {
                low = mid + 1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr = {8,4,2,3};
        int limit = 10;

        int result = smallestDivisor(arr, limit);
        System.out.println("The minimum divisor is : " + result);
    }
}
