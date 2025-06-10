package Arrays.Easy.NumberAppearOnce;

public class LinearSearchApproach {
    public static int numberAppearOnce(int[] arr, int n) {
        for (int i=0; i<n; i++) {
            int num = arr[i];
            int count = 0;
            for (int j=0; j<n; j++) {
                if (arr[j] == num) {
                    count++;
                }
            }
            if (count == 1) return num;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,3,4,6,5,6,3,4};
        int n = arr.length;

        int ans = numberAppearOnce(arr, n);
        System.out.println("Number appears once in the array is : " + ans);
    }
}
