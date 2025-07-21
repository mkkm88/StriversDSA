package Arrays.Hard;

public class CountSubArrayWithXORK {
    public static int subarraysWithXORK(int[] arr, int k) {
        int n = arr.length;
        int count = 0;
        for (int i=0; i<n; i++) {
            for (int j=i; j<n; j++) {
                int xor = 0;
                for (int K = i; K <=j; K++) {
                    xor = xor ^ arr[K];
                }
                if (xor == k) count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {4,2,2,6,4};
        int k = 6;

        int ans = subarraysWithXORK(arr, k);
        System.out.print("Number of subarrays with xor " + k + " is  : " + ans);
    }
}
