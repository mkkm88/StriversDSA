package Arrays.Easy.NumberAppearOnce;

public class HashingApproach {
    public static int numberAppearOnce(int[] arr, int n) {
        int max_element = 0;
        for (int i=0; i<n; i++) {
            max_element = Math.max(max_element, arr[i]);
        }

        int[] hash = new int[max_element+1];

        for (int i=0; i<n; i++) {
            hash[arr[i]]++;
        }

        for (int i=0; i<n; i++) {
            if (hash[arr[i]] == 1) {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,3,4,6,3,4};
        int n = arr.length;

        int ans = numberAppearOnce(arr, n);
        System.out.println("Number appears once in the array is : " + ans);
    }
}
