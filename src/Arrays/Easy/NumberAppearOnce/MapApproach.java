package Arrays.Easy.NumberAppearOnce;

import java.util.HashMap;
import java.util.Map;

public class MapApproach {
    public static int getSingleElement(int[] arr, int n) {
        // Declare the hashmap.
        // And hash the given array:
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for (int i=0; i<n; i++) {
            int value = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i], value+1);
        }

        //Find the single element and return the answer:
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() == 1) {
                return it.getKey();
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,1,2};
        int n = arr.length;

        int ans = getSingleElement(arr, n);
        System.out.println("The single element is : " + ans);
    }
}
