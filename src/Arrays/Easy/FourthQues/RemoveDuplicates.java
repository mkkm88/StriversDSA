package Arrays.Easy.FourthQues;

public class RemoveDuplicates {
    // TC => O(n) || SC => O(1)
    public static int removeDups(int[] arr) {
        int i = 0;
        for (int j=1; j<arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,2,2,3,3,3,4,4,5,6,7,8};
        int k = removeDups(arr);
        for (int i=0; i<k; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
