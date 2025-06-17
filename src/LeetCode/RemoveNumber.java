package LeetCode;

import java.util.Arrays;

public class RemoveNumber {
    public static int removeNumber(int[] nums, int val) {
        int n = nums.length;

        int j = 0;
        for (int i=0; i<n; i++) {
            if (nums[i] == val) {
                j = i;
                break;
            }
        }

        for (int i=j+1; i<n; i++) {
            if (nums[i] != val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }

        int k = 0;
        for (int num : nums) {
            if (num != val) {
                k++;
            }
        }

        return k;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        int ans = removeNumber(nums, val);
        System.out.println(ans);
    }
}
