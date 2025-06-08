package Arrays.Easy.TenthQues;

public class FindMissingNumberBFA {
    public static void main(String[] args) {
        int n = 5;

        // array of n-1 size
        int[] arr = {1,2,4,5};

        // array of n size
        int[] temp = {1,2,3,4,5};

        int j = 0;
        for (int i=0; i<n-1; i++) {
            if (arr[i] != temp[j]) {
                System.out.println("Missing number in the array is : "+ temp[j]);
                break;
            }
            j++;
        }
    }
}
