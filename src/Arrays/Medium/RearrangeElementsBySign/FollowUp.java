package Arrays.Medium.RearrangeElementsBySign;

public class FollowUp {
    public static int[] rearrangeBySign(int[] arr, int n) {
        int pos = 0;
        int neg = 1;

        while (pos < n && neg < n) {
            if (arr[pos] >= 0) {
                pos +=2;
            } else if (arr[neg] < 0) {
                neg += 2;
            } else {
                int temp = arr[pos];
                arr[pos] = arr[neg];
                arr[neg] = temp;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr= {-2,1,3,-1,2,-3};
        int n = arr.length;

        int[] ans= rearrangeBySign(arr,n);

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
