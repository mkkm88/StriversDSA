package Arrays.Easy.TenthQues;

import java.util.Arrays;

public class XORApproach {
    public static int missingNumber(int[] arr, int n) {
        int xor1 = 0;
        int xor2 = 0;

        for (int i=0; i<n-1; i++) {
            // XOR of array elements
            xor2 = xor2 ^ arr[i];

            // XOR up to [1....n-1]
            xor1 = xor1 ^ (i+1);
        }
        // XOR up to [1......n]
        xor1 = xor1 ^ n;

        // the missing number
        return (xor1 ^ xor2);
    }
    public static void main(String[] args) {
        int n = 10;
        int[] arr = {2,3,4,5,6,7,8,9,10};

        int ans = missingNumber(arr, n);
        System.out.println("the missing number is : " + ans);
    }
}
