package Arrays.Hard;

import java.lang.reflect.Array;
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

        /*for (int i=0; i<n; i++) {
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
        }*/

        Arrays.sort(arr);
        for (int i=0; i<n; i++) {
            if (i != 0 && arr[i] == arr[i-1]) continue;
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                    set.add(temp);
                    j++;
                    k--;
                    while (j < k && arr[j] == arr[j-1]) j++;
                    while (j < k && arr[k] == arr[k+1]) k--;
                }
            }
        }
        return new ArrayList<>(set);
    }
    public static void main(String[] args) {
        int[] arr = {-2,0,1,1,2};
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
