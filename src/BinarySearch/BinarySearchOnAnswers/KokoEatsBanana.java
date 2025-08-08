package BinarySearch.BinarySearchOnAnswers;

public class KokoEatsBanana {
    public static int maxElement(int[] arr) {
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;

        for (int j : arr) {
            maxi = Math.max(maxi, j);
        }
        return maxi;
    }

    public static int calculateTotalHours(int[] arr, int hourly) {
        int n = arr.length;
        int totalH = 0;
        for (int j : arr) {
            totalH += (int) Math.ceil((double) j / (double) (hourly));
        }
        return totalH;
    }
    public static int minimumRateToEatBananas(int[] arr, int h) {
        int low = 0;
        int high = maxElement(arr);
        int ans = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = (low + high) / 2;
            int totalHours = calculateTotalHours(arr, mid);
            if (totalHours <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3,6,7,11};
        int h = 8;

        int result = minimumRateToEatBananas(arr, h);
        System.out.println("Koko should eat at least " + result + " bananas/hr.");
    }
}
