package Arrays.Easy;

import java.util.Arrays;

public class Largest {
    public static int sort(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static void main(String[] args) {
        int[] arr = {11, 11, 10, 2, 11};
        // 1st Method (Recursive)
        /*int largest = arr[0];
        for (int i=1; i<arr.length; i++) {
            if (arr[i] >= largest) {
                largest = arr[i];
            }
        }
        System.out.println(largest);*/

        // 2nd Method (Brute Force Approach)
        System.out.print("The largest element in the array is  : " + sort(arr));
    }
}
