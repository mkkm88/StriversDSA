package Arrays.Easy.TenthQues;

public class FindMissingNumberBA {
    public static int missingNumber(int[] arr, int n) {
        int[] hash = new int[n+1];

        for (int i=0; i<n-1; i++) {
            hash[arr[i]]++;
        }

        for (int i=1; i<=n; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1,2,4,5};

        int ans = missingNumber(arr, n);
        System.out.println(ans);
    }
}
