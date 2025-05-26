package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IntegerHashingUsingHashmap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("The array elements are : ");
        for (int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        // pre-compute
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i=0; i<n; i++) {
            int key = arr[i];
            int freq = 0;
            if (mp.containsKey(key)) freq = mp.get(key);
            freq++;
            mp.put(key, freq);
        }

        // Iterate over the map
        for (Map.Entry<Integer, Integer> it : mp.entrySet()) {
            System.out.println(it.getKey() + "->" + it.getValue());
        }

        System.out.print("Enter the number of queries : ");
        int q = scanner.nextInt();
        System.out.print("Query : ");
        while (q-- > 0) {
            int num = scanner.nextInt();
            // fetch
            if (mp.containsKey(num)) System.out.println("The number " + num + " found " + mp.get(num) + " time");
            else System.out.println(0);
        }
    }
}
