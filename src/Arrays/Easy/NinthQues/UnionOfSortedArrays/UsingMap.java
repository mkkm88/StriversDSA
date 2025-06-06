package Arrays.Easy.NinthQues.UnionOfSortedArrays;

import java.util.ArrayList;
import java.util.HashMap;

public class UsingMap {
    // TC => O((m+n)log(m+n)) && SC => O(n+m) || O(1)
    public static ArrayList<Integer> printUnion(int[] arr1, int[] arr2, int n, int m) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i=0; i<n; i++) {
            freq.put(arr1[i], freq.getOrDefault(arr1[i],0)+1);
        }

        for (int i=0; i<m; i++) {
            freq.put(arr2[i], freq.getOrDefault(arr2[i],0)+1);
        }

        return new ArrayList<>(freq.keySet());
    }
    public static void main(String[] args) {
        int n = 9, m = 8;
        int[] arr1 = {1,2,3,4,5,10,11,12,13};
        int[] arr2 = {2,3,4,4,5,6,7,8};

        ArrayList<Integer> union = printUnion(arr1, arr2, n ,m);
        System.out.print("Union of arr1 and arr2 is : ");
        for (int val : union)
            System.out.print(val+ " ");
    }
}
