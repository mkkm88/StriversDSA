package Arrays.Easy.NumberAppearOnce;

public class XORApproach {
    public static int getSingleElement(int[] arr, int n) {
        int xor = 0;
        for (int i=0; i<n; i++) {
            xor = xor ^ arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,4,1,3,2,3};
        int n = arr.length;

        int ans = getSingleElement(arr, n);
        System.out.println("the single element is : " + ans);
    }
}
