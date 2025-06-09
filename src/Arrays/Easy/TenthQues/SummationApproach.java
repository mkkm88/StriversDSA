package Arrays.Easy.TenthQues;

public class SummationApproach {
    public static int missingNumber(int[] arr, int n) {
        // sum of first n numbers
        int s1 = (n*(n+1))/2;

        // sum of the array elements
        int s2 = 0;
        for (int i=0; i<n-1; i++) {
            s2 += arr[i];
        }

        // the difference of s1 and s2 is missing number
        return s1-s2;
    }
    public static void main(String[] args) {
        int n = 10;
        int[] arr = {1,2,3,4,5,6,7,8,9};

        int ans = missingNumber(arr, n);
        System.out.println("The missing number is : " + ans);
    }
}