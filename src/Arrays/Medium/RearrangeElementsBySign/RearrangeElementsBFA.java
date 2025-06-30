package Arrays.Medium.RearrangeElementsBySign;
import java.util.*;

public class RearrangeElementsBFA {
    public static int[] rearrangeBySign(int[] arr, int n){
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();

        // Segregate the array into positives and negatives.
        for(int i=0;i<n;i++){

            if(arr[i]>0) pos.add(arr[i]);
            else neg.add(arr[i]);
        }

        // Positives on even indices, negatives on odd.
        for(int i=0;i<n/2;i++){

            arr[2*i] = pos.get(i);
            arr[2*i+1] = neg.get(i);
        }
        return arr;
    }

    public static void main(String[] args)
    {
        int[] arr= {1,2,-3,-1,-2,3};
        int n = arr.length;

        int[] ans= rearrangeBySign(arr,n);

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
