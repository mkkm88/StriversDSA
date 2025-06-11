package CodingNinjas;

import java.util.Arrays;

public class Sort012 {
    /*public static int[] sort012(int[] arr, int n) {
        int countZeros = 0;
        int countOnes = 0;
        int countTwos = 0;
        for (int i=0; i<n; i++) {
            if (arr[i] == 0) {
                countZeros++;
            } else if (arr[i] == 1) {
                countOnes++;
            } else {
                countTwos++;
            }
        }

        for (int i=0; i<n; i++) {
            if(countZeros > 0) {
                arr[i] = 0;
                countZeros--;
            } else if(countOnes > 0) {
                arr[i] = 1;
                countOnes--;
            } else {
                arr[i] = 2;
                countTwos--;
            }
        }
        return arr;
    }*/
    public static int[] sort012(int[] arr, int n) {
        int current = 0;
        int zeropos = 0;
        int twopos = arr.length-1;

        while (zeropos <= twopos) {
            if (arr[zeropos] == 0) {
                int temp = arr[current];
                arr[current] = arr[zeropos];
                arr[zeropos] = temp;
                current++;
                zeropos++;
            } else if (arr[zeropos] == 1) {
                zeropos++;
            } else {
                int temp1 = arr[zeropos];
                arr[zeropos] = arr[twopos];
                arr[twopos] = temp1;
                twopos--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,1,0,2,1,0};
        int n = arr.length;

        /*Arrays.sort(arr);
        for (int j : arr) {
            System.out.print(j);
        }*/

        int[] ans = sort012(arr, n);
        for (int j : ans) {
            System.out.print(j+ " ");
        }
    }
}
