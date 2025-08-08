package BinarySearch.BinarySearchOnAnswers;

public class MinDaysMakeBouquets {
    public static boolean possibleDays(int[] arr, int day, int m, int k) {
        int numberOfBouquets = 0;
        int count = 0;

        for (int i=0;i<arr.length;i++) {
            if (arr[i] <= day) {
                count++;
            } else {
                numberOfBouquets += (count / k);
                count = 0;
            }
        }
        numberOfBouquets += (count / k);
        return numberOfBouquets >= m;
    }
    public static int minimumDaysToMakeBouquets(int[] arr, int m, int k) {
        long val = (long) m * k;
        int n = arr.length;
        if (val > n) return -1;

        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;

        for (int i=0; i<n; i++) {
            mini = Math.min(mini, arr[i]);
            maxi = Math.max(maxi, arr[i]);
        }

        for (int i=mini; i<=maxi; i++) {
            if (possibleDays(arr, i, m, k)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {7,7,7,7,13,11,12,7};
        int m = 2;
        int k = 3;

        int result = minimumDaysToMakeBouquets(arr, m, k);
        if (result == -1) {
            System.out.println("We cannot make m bouquets.");
        } else {
            System.out.println("We can make bouquets on day " + result);
        }

    }
}
