package Arrays.Hard;
import java.util.*;

public class MergeOverlappingIntervals {
    public static int[][] mergeOverlappingIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        ArrayList<int[]> merged = new ArrayList<>();

        for (int[] interval : intervals) {
            if (merged.isEmpty() || interval[0] > merged.getLast()[1]) {
                merged.add(interval);
            } else {
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {2,6}, {8,9}, {9,11}, {8, 10}, {2, 4}, {15, 18}, {16,17}};
        int[][] ans = mergeOverlappingIntervals(arr);
        System.out.print("The merged intervals are: \n");
        for (int[] it : ans) {
            System.out.print("[" + it[0] + ", " + it[1] + "] ");
        }
        System.out.println();
    }
}
