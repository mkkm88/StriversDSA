package CodingNinjas;

import java.util.Arrays;

public class BobsRobot {
    public static int bobsRobot(int[] arr, int n) {
        Arrays.sort(arr);   // O(nlog(n))
        int bobRobotIndex = 0;
        for (int i=1; i<n; i++) {
            if (arr[i] > arr[bobRobotIndex]) {
                bobRobotIndex = i;
            }
        }

        for (int i=0; i<n; i++) {
            if (i != bobRobotIndex) {
                if (!(arr[bobRobotIndex] >= 2*arr[i])) {
                    return -1;
                }
            }
        }
        return bobRobotIndex;
    }
    public static void main(String[] args) {
        int[] arr = {1,6,13,7,6};
        int n = arr.length;

        int ans = bobsRobot(arr, n);
        System.out.println(ans);
    }
}
