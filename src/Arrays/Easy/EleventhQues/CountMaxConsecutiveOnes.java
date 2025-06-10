package Arrays.Easy.EleventhQues;

public class CountMaxConsecutiveOnes {
    public static int maxConsecutiveOne(int[] arr, int n) {
        int count = 0;
        int max_count = 0;

        for (int i=0; i<n; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            max_count = Math.max(max_count, count);
        }
        return max_count;
    }
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,0,0,0,0,0,1,1};
        int n = arr.length;

        int ans = maxConsecutiveOne(arr, n);
        System.out.println("The maximum consecutive ones are : " + ans);
    }
}
