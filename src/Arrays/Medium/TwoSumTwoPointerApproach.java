package Arrays.Medium;

import java.util.Arrays;

public class TwoSumTwoPointerApproach {
    public static String twoSum(int[] arr, int target, int n) {
        Arrays.sort(arr);
        int left = 0;
        int right = n-1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return "YES";
            } else if (sum < target) left++;
            else right--;
        }
        return "NO";
    }
    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int target = 14;
        int n = 5;

        String ans = twoSum(arr, target, n);
        System.out.println("This is the answer for variant1 : " + ans);

        /*int[] result = sumTwo(arr, target);
        System.out.println("This is the answer for variant2 : [" + result[0] + ", " + result[1] + "]");*/
    }
}
