package Arrays.Easy.SecondQues;

public class OptimalApproach {
    public static int secondSmallest(int[] arr, int n) {
        if (n < 2) {
            return -1;
        }

        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;

        int i;
        for (i=0; i<n; i++) {
            if (arr[i] < small) {
                secondSmall = small;
                small = arr[i];
            } else if (arr[i] < secondSmall && arr[i] != small) {
                secondSmall = arr[i];
            }
        }
        return secondSmall;
    }

    public static int secondLargest(int[] arr, int n) {
        if (n < 2) {
            return -1;
        }

        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;

        int i;
        for (i=0; i<n; i++) {
            if (arr[i] > large) {
                secondLarge = large;
                large = arr[i];
            } else if (arr[i] > secondLarge && arr[i] != large) {
                secondLarge = arr[i];
            }
        }
        return secondLarge;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,7,5};
        int n = arr.length;

        int sS = secondSmallest(arr, n);
        int sL = secondLargest(arr, n);

        System.out.println("Second smallest is : " + sS);
        System.out.println("Second largest is : " + sL);
    }
}
