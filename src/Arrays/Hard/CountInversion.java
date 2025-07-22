package Arrays.Hard;

public class CountInversion {
    public static int conquer(int[] arr, int si, int mid, int ei) {
        int[] merged = new int[ei-si+1];
        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;

        int count = 0;
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x] = arr[idx1];
                idx1++;
            } else {
                merged[x] = arr[idx2];
                count += (mid - idx1 + 1);
                idx2++;
            }
            x++;
        }
        while (idx1 <= mid) {
            merged[x] = arr[idx1];
            idx1++;
            x++;
        }
        while (idx2 <= ei) {
            merged[x] = arr[idx2];
            idx2++;
            x++;
        }

        for (int i=0, j=si; i<merged.length; i++, j++) {
            arr[j] = merged[i];
        }
        return count;
    }
    public static int countInversion(int[] arr, int si, int ei) {
        int count = 0;
        if (si >= ei) return count;
        int mid = si + (ei - si)/2;
        count += countInversion(arr, si, mid);
        count += countInversion(arr, mid+1, ei);
        count += conquer(arr, si, mid, ei);
        return count;
    }
    public static int numberOfInversion(int[] arr, int n) {
        return countInversion(arr, 0, n-1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;

        int ans = numberOfInversion(arr, n);
        System.out.println(ans);
    }
}
