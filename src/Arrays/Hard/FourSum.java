package Arrays.Hard;

import java.util.*;

public class FourSum {
    public static List<List<Integer>> quadruplets(int[] arr, int target) {
        int n = arr.length;
        Set<List<Integer>> set = new HashSet<>();

        /*for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                for (int k=j+1; k<n; k++) {
                    for (int l=k+1; l<n; l++) {
                        int sum = arr[i] + arr[j] + arr[k] + arr[l];
                        if (sum == target) {
                            List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
                            temp.sort(null);
                            set.add(temp);
                        }
                    }
                }
            }
        }*/

        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                HashSet<Integer> hashSet = new HashSet<>();
                for (int k=j+1; k<n; k++) {
                    int fourth = target -(arr[i] + arr[j] + arr[k]);
                    if (hashSet.contains(fourth)) {
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], fourth);
                        temp.sort(null);
                        set.add(temp);
                    }
                    hashSet.add(arr[k]);
                }
            }
        }
        return new ArrayList<>(set);
    }
    public static void main(String[] args) {
        int[] arr = {1,0,-1,0,-2,2};
        int target = 0;
        List<List<Integer>> ans = quadruplets(arr, target);
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
