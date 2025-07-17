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
                        long sum = (long) arr[i] + arr[j];
                        sum += arr[k];
                        sum += arr[l];
                        if (sum == target) {
                            List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
                            Collections.sort(temp);
                            set.add(temp);
                        }
                    }
                }
            }
        }*/

        /*for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                Set<Long> hashSet = new HashSet<>();
                for (int k=j+1; k<n; k++) {
                    long sum = arr[i] + arr[j];
                    sum += arr[k];
                    long fourth = target - sum;
                    if (hashSet.contains(fourth)) {
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], (int) fourth);
                        temp.sort(Integer::compareTo);
                        set.add(temp);
                    }
                    hashSet.add((long) arr[k]);
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
                    long sum = arr[i] + arr[j];
                    sum += arr[k];
                    sum += arr[l];
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
        int[] arr = {1000000000,1000000000,1000000000,1000000000};
        int target = -294967296;
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
