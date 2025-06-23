package LeetCode;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void mergeArrays(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1; // Pointer for nums1's actual elements
        int j = n-1; // Pointer for nums2
        int k = m+n-1; // Pointer for the merged array (starting from the end of nums1's total capacity)

        while (j >= 0) { // As long as there are elements in nums2 to consider
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--]; // Move element from nums1 if it's larger
            } else {
                nums1[k--] = nums2[j--]; // Move element from nums2
            }
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        // According to the typical LeetCode problem, nums1 should have enough space
        int[] nums1 = {1, 2, 3, 0, 0, 0}; // nums1 with initial m elements and n zeros for space
        int m = 3; // Number of actual elements in nums1
        int[] nums2 = {2, 5, 6};
        int n = nums2.length; // Number of elements in nums2

        mergeArrays(nums1, m, nums2, n); // Output: [1, 2, 2, 3, 5, 6]
    }
}