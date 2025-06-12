package CodingNinjas;

import java.util.ArrayList;

public class MissingNumbers {
    public static ArrayList<Integer> missingNumber(int[] arr, int n) {
        ArrayList<Integer> list = new ArrayList<>();

        int min = arr[0];
        int max = arr[0];
        for (int i=1; i<n; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        System.out.println(min);
        System.out.println(max);

        for (int i=min+1; i<max; i++) {
            boolean found = false;
            for (int j=0; j<n; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {5,2,7,8,1};
        int n = arr.length;

        ArrayList<Integer> ans = missingNumber(arr, n);
        System.out.println(ans);
    }
}
