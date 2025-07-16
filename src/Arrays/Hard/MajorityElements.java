package Arrays.Hard;
import java.util.*;

public class MajorityElements {
    public static List<Integer> majorityElement(int[] arr, int n) {
        List<Integer> list = new ArrayList<>();
        int mini = (int) (n/3) + 1;

        /*for (int i=0; i<n; i++) {
            if (list.isEmpty() || list.getFirst() != arr[i]) {
                int count = 0;
                for (int j=0; j<n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                if (count > n/3) {
                    list.add(arr[i]);
                }
                if (list.size() == 2) break;
            }
        }*/

        /*HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<n; i++) {
            int value = map.getOrDefault(arr[i], 0);
            map.put(arr[i], value + 1);

            if (map.get(arr[i]) == mini) {
                list.add(arr[i]);
            }
            if (list.size() == 2) break;
        }*/

        int count1 = 0; int count2 = 0;
        int element1 = Integer.MIN_VALUE; int element2 = Integer.MIN_VALUE;
        for (int i=0; i<n; i++) {
            if (count1 == 0 && element2 != arr[i]) {
                count1 = 1;
                element1 = arr[i];
            } else if (count2 == 0 && element1 != arr[i]) {
                count2 = 1;
                element2 = arr[i];
            } else if (arr[i] == element1) count1++;
            else if (arr[i] == element2) count2++;
            else {
                count1--;
                count2--;
            }
        }
        count1 = 0; count2 = 0;
        for (int i=0; i<n; i++) {
            if (arr[i] == element1) count1++;
            if (arr[i] == element2) count2++;
        }
        if (count1 >= mini) list.add(element1);
        if (count2 >= mini) list.add(element2);
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,2,2,3,4,2,3,2};
        int n = arr.length;

        List<Integer> ans = majorityElement(arr, n);
        System.out.println(ans);
    }
}
