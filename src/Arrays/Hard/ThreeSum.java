package Arrays.Hard;

import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> triplet(int[] arr) {
        Set<List<Integer>> set = new HashSet<>();
        int n = arr.length;
        /*for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                for (int k=j+1; k<n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                        temp.sort(null);
                        set.add(temp);
                    }
                }
            }
        }*/

        for (int i=0; i<n; i++) {
            HashSet<Integer> hashset = new HashSet<>();
            for (int j=i+1; j<n; j++) {
                int third = -(arr[i] + arr[j]);
                if (hashset.contains(third)) {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
                    temp.sort(null);
                    set.add(temp);
                }
                hashset.add(arr[j]);
            }
        }
        return new ArrayList<>(set);
    }
    public static void main(String[] args) {
        int[] arr = {-1,0,2,-1,1,-4};
        List<List<Integer>> ans = triplet(arr);
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("]");
        }
        System.out.println();
    }
}
