package Arrays.Easy.SeventhQues;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZerosToEnd {
    public static int[] moveToEnd(int[] arr, int n) {
        /*ArrayList<Integer> temp = new ArrayList<>();

        // copy non-zero from original to temp arrayList
        for (int i=0; i<n; i++) {
            if (arr[i] != 0) {
                temp.add(arr[i]);
            }
        }

        // number of non-zero elements
        int nz = temp.size();

        // copy elements from temp, fill first nz fields of original array
        for (int i=0; i<nz; i++) {
            arr[i] = temp.get(i);
        }

        // fill rest of the cell with 0
        for (int i=nz; i<n ;i++) {
            arr[i] = 0;
        }
        return arr;*/

        int[] temp = new int[n];
        int j = 0;
        int k = n-1;
        for (int i=0; i<n; i++) {
            if (arr[i] != 0) {
                temp[j++] = arr[i];
            } else {
                temp[k--] = arr[i];
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int n = arr.length;

        int[] result = moveToEnd(arr, n);
        for (int i=0; i<n; i++) {
            System.out.print(result[i]+ " ");
        }
    }
}
