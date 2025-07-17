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

        /*for (int i=0; i<n; i++) {
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
        }*/

        Arrays.sort(arr);
        for (int i=0; i<n; i++) {
            if (i > 0 && arr[i] == arr[i-1]) continue;
            for (int j=i+1; j<n; j++) {
                if (j != i+1 && arr[j] == arr[j-1]) continue;
                int k = j + 1;
                int l = n - 1;
                while (k < l) {
                    int sum = arr[i] + arr[j] + arr[k] + arr[l];
                    if (sum < target) {
                        k++;
                    } else if (sum > target) {
                        l--;
                    } else {
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
                        set.add(temp);
                        k++; l--;
                        while (k < l && arr[k] == arr[k-1]) k++;
                        while (k < l && arr[l] == arr[l+1]) l--;
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,3,1,4,4,5,5,2,3,1,4};
        int target = 8;
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
