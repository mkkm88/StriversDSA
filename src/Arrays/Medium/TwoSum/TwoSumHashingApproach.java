package Arrays.Medium.TwoSum;

import java.util.HashMap;

public class TwoSumHashingApproach {
    public static String twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<arr.length; i++) {
            int num = arr[i];
            int moreNeeded =  target-num;
            if (map.containsKey(moreNeeded)) {
                return "YES";
            }

            map.put(arr[i], i);
        }
        return "NO";
    }

    public static int[] sumTwo(int[] arr, int target) {
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;

        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i=0; i< arr.length; i++) {
            int num = arr[i];
            int moreNeeded = target - num;
            if (mpp.containsKey(moreNeeded)) {
                ans[0] = mpp.get(moreNeeded);
                ans[1] = i;
                return ans;
            }

            mpp.put(arr[i], i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int target = 14;

        String ans = twoSum(arr, target);
        System.out.println("This is the answer for variant1 : " + ans);

        int[] result = sumTwo(arr, target);
        System.out.println("This is the answer for variant2 : [" + result[0] + ", " + result[1] + "]");
    }
}
