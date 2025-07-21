package Arrays.Hard;

import java.util.Arrays;

public class MergeSortedArraysWithoutExtraSpace {
    public static void swapIfGreater(long[] arr1, long[] arr2, int idx1, int idx2) {
        if (arr1[idx1] > arr2[idx2]) {
            long temp = arr1[idx1];
            arr1[idx1] = arr2[idx2];
            arr2[idx2] = temp;
        }
    }
    public static void mergeSortedArrays(long[] arr1, long[] arr2, int n, int m) {
        // TC = O(n+m) + O(n+m)
        // SC = O(n+m)
        /*long[] arr3 = new long[n+m];
        int left = 0;
        int right = 0;
        int index = 0;

        while (left < n && right < m) {
            if (arr1[left] <= arr2[right]) {
                arr3[index] = arr1[left];
                left++;
            } else {
                arr3[index] = arr2[right];
                right++;
            }
            index++;
        }
        while (left < n) arr3[index++] = arr1[left++];
        while (right < m) arr3[index++] = arr2[right++];

        for (int i=0; i<n+m; i++) {
            if (i < n) arr1[i] = arr3[i];
            else arr2[i-n] = arr3[i];
        } */

        // TC = O(min(n,m)) + O(nlogn) + O(mlogm)
        // SC = O(1)
        /*int left = n-1;
        int right = 0;
        while (left >= 0 && right < m) {
            if (arr1[left] > arr2[right]) {
                long temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                left--; right++;
            } else break;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);*/

        int len = n +m;
        int gap = (len / 2) + (len % 2);
        while (gap > 0) {
            int left = 0;
            int right = left + gap;
            while (right < len) {
                // arr1 and arr2
                if (left < n && right >= n) {
                    swapIfGreater(arr1, arr2, left, right-n);
                }
                // arr2 and arr2
                else if (left >= n) {
                    swapIfGreater(arr2, arr2, left-n, right-n);
                }
                // arr1 and arr1
                else {
                    swapIfGreater(arr1, arr1, left, right);
                }
                left++; right++;
            }
            if (gap == 1) break;
            gap = (gap / 2) + (gap % 2);
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
    public static void main(String[] args) {
        long[] arr1 = {1,3,5,7};
        long[] arr2 = {0,2,6,8,9};
        int n = arr1.length;
        int m = arr2.length;

        mergeSortedArrays(arr1, arr2, n, m);
    }
}
