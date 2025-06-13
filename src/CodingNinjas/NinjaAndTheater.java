package CodingNinjas;

public class NinjaAndTheater {
    public static int maxDistance(int[] seats, int n) {
        int[] left = new int[n];
        int[] right = new int[n];

        int prev = -1;
        for (int i=0; i<n; i++) {
            if (seats[i] == 1) {
                prev = i;
                left[i] = 0;
            } else {
                left[i] = (prev == -1) ? n : i - prev;
            }
        }

        prev = -1;
        for (int i=n-1; i>=0; i--) {
            if (seats[i] == 1) {
                prev = i;
                right[i] = 0;
            } else {
                right[i] = (prev == -1) ? n : prev - i;
            }
        }

        int ans = 0;
        for (int i=0; i<n; i++) {
            if (seats[i] == 0) {
                ans = Math.max(ans, Math.min(left[i], right[i]));
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] seats = {1,0,1,0,0,0,1};
        int n = seats.length;

        int result = maxDistance(seats, n);
        System.out.println(result);
    }
}
