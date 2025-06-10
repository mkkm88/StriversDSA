package Arrays.Easy.EleventhQues;

public class CountMaxConsecutiveOnes {
    public static int maxConsecutiveOne(int[] arr, int n) {
        int count = 0;
        int max_count = 0;

        for (int i=0; i<n; i++) {
            if (arr[i] == 1) {
                count++;
                if (count > max_count) {
                    max_count++;
                }
            } else if (arr[i] == 0) {
                count = 0;
            }
        }
        return max_count;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        int n = arr.length;

        int ans = maxConsecutiveOne(arr, n);
        System.out.println("The maximum consecutive ones are : " + ans);
    }
}
