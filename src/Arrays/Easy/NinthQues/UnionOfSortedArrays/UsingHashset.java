package Arrays.Easy.NinthQues.UnionOfSortedArrays;

import java.util.ArrayList;
import java.util.HashSet;

public class UsingHashset {
    public static ArrayList<Integer> printUnion(int[] arr1, int[] arr2, int n, int m) {
        HashSet<Integer> set = new HashSet<>();

        for (int i=0; i<n; i++) {
            set.add(arr1[i]);
        }

        for (int i=0; i<m; i++) {
            set.add(arr2[i]);
        }

        return new ArrayList<>(set);
    }
    public static void main(String[] args) {
        int n = 5, m = 8;
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5,6,7,8};

        ArrayList<Integer> union = printUnion(arr1, arr2, n ,m);
        System.out.print("Union of arr1 and arr2 is : ");
        for (int val : union)
            System.out.print(val+ " ");
    }
}
