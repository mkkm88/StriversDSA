package Arrays.Medium;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    /*public static int majorityElement(int[] arr, int N) {
        for (int i=0; i<N; i++) {
            int count = 0;
            for (int j=0; j<N; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > N/2) {
                return arr[i];
            }
        }
        return -1;
    }*/

    /*public static int majorityElement(int[] arr, int n) {
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for (int i=0; i<n; i++) {
            int value = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i], value+1);
        }

        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() > n/2) {
                return it.getKey();
            }
        }
        return -1;
    }*/

    public static int majorityElement(int[] arr, int n) {
        int count = 0;
        int element = 0;

        for (int i=0; i<n; i++) {
            if (count == 0) {
                count = 1;
                element = arr[i];
            } else if (arr[i] == element) {
                count++;
            } else count--;
        }
        return element;
    }
    public static void main(String[] args) {
        int[] arr = {4,4,2,4,3,4,4,3,2,4};
        int n = arr.length;

        int ans = majorityElement(arr, n);
        System.out.println(ans);
    }
}
