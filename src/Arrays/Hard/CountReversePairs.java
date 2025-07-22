package Arrays.Hard;

public class CountReversePairs {
    public static int reversePairs(int[] arr) {
        int n = arr.length;
        int count = 0;

        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                if (arr[i] > 2 * arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,1,2,5,6,8,2,4,6,10,2,9,3,1,5,7};

        int ans = reversePairs(arr);
        System.out.println(ans);
    }
}
