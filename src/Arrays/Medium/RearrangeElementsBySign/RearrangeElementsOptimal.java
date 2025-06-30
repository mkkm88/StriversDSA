package Arrays.Medium.RearrangeElementsBySign;

public class RearrangeElementsOptimal {
    public static int[] rearrangeBySign(int[] arr, int n) {
        int posIndex = 0;
        int negIndex = 1;

        int[] result = new int[n];

        for (int i=0; i<n; i++) {
            if (arr[i] >= 0) {
                result[posIndex] = arr[i];
                posIndex += 2;
            } else {
                result[negIndex] = arr[i];
                negIndex += 2;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr= {1,2,-3,-1,-2,3};
        int n = arr.length;

        int[] ans= rearrangeBySign(arr,n);

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
