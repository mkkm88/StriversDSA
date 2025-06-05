package Arrays.Easy.EigthQues;

public class LinearSearch {
    public static int search(int[] arr, int num) {
        int n = arr.length;
        int i;
        for (i=0; i<n; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int num = 3;

        System.out.println(num + " found at " + search(arr, num) + " index");
    }
}
