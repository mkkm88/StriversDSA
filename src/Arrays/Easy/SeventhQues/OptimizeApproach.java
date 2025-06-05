package Arrays.Easy.SeventhQues;

public class OptimizeApproach {
    public static int[] moveZerosToEnd(int[] arr, int n) {
        int j = -1;
        for (int i=0; i<n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        for (int i=j+1; i<n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,3,0,12};
        int n = arr.length;

        int[] result = moveZerosToEnd(arr, n);
        for (int i=0; i<n; i++) {
            System.out.print(result[i]+ " ");
        }
    }
}
