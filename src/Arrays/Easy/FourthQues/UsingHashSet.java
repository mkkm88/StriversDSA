package Arrays.Easy.FourthQues;

import java.util.HashSet;

public class UsingHashSet {
    public static int removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i<arr.length; i++) {
            set.add(arr[i]);
        }
        int k = set.size();
        int j = 0;
        for (int x : set) {
            arr[j++] = x;
        }
        return k;
    }
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,2,2,3,3,3,4,4,5,6,7,8};
        int k = removeDuplicates(arr);
        for (int i=0; i<k; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
