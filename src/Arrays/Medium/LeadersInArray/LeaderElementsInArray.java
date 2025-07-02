package Arrays.Medium.LeadersInArray;

import java.util.ArrayList;

public class LeaderElementsInArray {
    public static ArrayList<Integer> printLeadersBruteForce(int[] arr, int n) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i=0; i<n; i++) {
            boolean leader = true;
            for (int j=i+1; j<n; j++) {
                if (arr[j] > arr[i]) {
                    leader = false;
                    break;
                }
            }
            if (leader) {
                ans.add(arr[i]);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {10,22,12,3,0,6};
        int n = arr.length;

        ArrayList<Integer> list = printLeadersBruteForce(arr, n);
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
