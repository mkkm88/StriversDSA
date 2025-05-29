package Arrays.Easy.SecondQues;

public class BetterApproach {
    public static void getElements(int[] arr, int n) {
        // TC => O(n) || SC => O(1)
        if (n == 0 || n == 1 || n == 2) {
            System.out.print(-1);
            System.out.print(" ");
            System.out.print(-1);
            System.out.print("\n");
            return;
        }

        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        int i;
        for (i=0; i<n; i++) {
            small = Math.min(small, arr[i]);
            large = Math.max(large, arr[i]);
        }
        for (i=0; i<n; i++) {
            if (arr[i] < second_small && arr[i] != small) {
                second_small = arr[i];
            }
            if (arr[i] > second_large && arr[i] != large) {
                second_large = arr[i];
            }
        }
        System.out.println("Second smallest is "+second_small);
        System.out.println("Second largest is "+second_large);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,7,5};
        int n = arr.length;

        getElements(arr, n);
    }
}
