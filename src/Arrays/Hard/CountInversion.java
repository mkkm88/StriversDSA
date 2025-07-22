package Arrays.Hard;

public class CountInversion {
    public static int countInversion(int[] arr, int n) {
        int count = 0;
        for (int i=0; i<n-1; i++) {
            for (int j=i; j<n; j++) {
                if (i < j && arr[j] < arr[i]) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {5,3,2,1,4};
        int n = arr.length;

        int ans = countInversion(arr, n);
        System.out.print("The inversion count is : " + ans);
    }
}
