package Arrays.Easy.NinthQues.UnionOfSortedArrays;

import java.util.ArrayList;

public class UsingTwoPointers {
    // TC => O(n+m) && SC => O(n+m) || O(1)
    public static ArrayList<Integer> printUnion(int[] arr1, int[] arr2, int n, int m) {
        int i = 0;
        int j = 0;

        ArrayList<Integer> union = new ArrayList<>();

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                if (union.isEmpty() || union.getLast() != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            } else {
                if (union.isEmpty() || union.getLast() != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            }
        }

        while (i < n) {
            if (union.getLast() != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }

        while (j < m) {
            if (union.getLast() != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }
        return union;
    }

    public static void main(String[] args) {
        int n = 6, m = 6;
        int[] arr1 = {1,1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5,6};

        ArrayList<Integer> union = printUnion(arr1, arr2, n ,m);
        System.out.print("Union of arr1 and arr2 is : ");
        for (int val : union)
            System.out.print(val+ " ");
    }
}
