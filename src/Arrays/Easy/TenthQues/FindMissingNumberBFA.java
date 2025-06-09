package Arrays.Easy.TenthQues;

public class FindMissingNumberBFA {
    public static int missingNumber(int[] arr, int n) {
        for (int i=1; i<=n; i++) {
            int flag = 0;
            for (int j=0; j<n-1; j++) {
                if (arr[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 10;
        // array of n-1 size
        int[] arr = {1,2,3,4,5,6,7,8,9};

        int ans = missingNumber(arr, n);
        System.out.println("The missing number is : " + ans);
    }
}
