package Arrays.Hard;

import java.util.HashMap;

public class CountSubArrayWithXORK {
    public static int subarraysWithXORK(int[] arr, int k) {
        int n = arr.length;
        int count = 0;
        /*for (int i=0; i<n; i++) {
            for (int j=i; j<n; j++) {
                int xor = 0;
                for (int K = i; K <=j; K++) {
                    xor = xor ^ arr[K];
                }
                if (xor == k) count++;
            }
        }*/

        /*for (int i=0; i<n; i++) {
            int xor = 0;
            for (int j=i; j<n; j++) {
                xor = xor ^ arr[j];
                if (xor == k) count++;
            }
        }*/

        int xor = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(xor, 1);

        for (int i=0; i<n; i++) {
            xor = xor ^ arr[i];
            int x = xor ^ k;

            if (map.containsKey(x)) {
                count += map.get(x);
            }

            if (map.containsKey(xor)) {
                map.put(xor, map.get(xor) + 1);
            } else {
                map.put(xor, 1);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {4,2,2,6,4};
        int k = 6;

        int ans = subarraysWithXORK(arr, k);
        System.out.print("Number of subarrays with xor " + k + " is  : " + ans);
    }
}
