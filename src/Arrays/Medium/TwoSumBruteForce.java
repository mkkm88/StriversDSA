package Arrays.Medium;

public class TwoSumBruteForce {
    public static String twoSum(int[] arr, int target) {
        int n = arr.length;

        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                if (arr[i] + arr[j] == target) {
                    return "YES";
                }
            }
        }
        return "NO";
    }

    public static int[] sumTwo(int[] arr, int target) {
        int n = arr.length;
        int[] ans = new int[2];

        ans[0] = ans[1] = -1;
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                if (arr[i] + arr[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
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
