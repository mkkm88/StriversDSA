package Hashing;

import java.util.Scanner;

public class HighAndLowFreq {
    public static void countFreq(int[] arr, int num) {
        boolean[] visited = new boolean[num];
        int maxFreq = 0;
        int minFreq = num;
        int maxElement = 0;
        int minElement = 0;

        for (int i=0; i<num; i++) {
            if (visited[i]) {
                continue;
            }

            int count = 1;
            for (int j=i+1; j<num; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            if (count > maxFreq) {
                maxElement = arr[i];
                maxFreq = count;
            }
            if (count < minFreq) {
                minElement = arr[i];
                minFreq = count;
            }
        }
        System.out.println("The highest frequency element is: " + maxElement);
        System.out.println("The lowest frequency element is: " + minElement);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int num = scanner.nextInt();
        int[] arr = new int[num];
        System.out.print("The array elements are : ");
        for (int i=0; i<num; i++) {
            arr[i] = scanner.nextInt();
        }

        countFreq(arr, num);
    }
}
