package CodingNinjas;

import java.util.Arrays;
import java.util.Stack;

public class NGEUsingStack {
    public static int[] nextGreaterElement(int[] arr, int n) {
        int[] NGE = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i=n-1; i>=0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            NGE[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }
        return NGE;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,3,4,2};
        int n = arr.length;

        int[] ans = nextGreaterElement(arr, n);
        System.out.println(Arrays.toString(ans));
    }
}
