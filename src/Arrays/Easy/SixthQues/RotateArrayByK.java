package Arrays.Easy.SixthQues;

import java.util.Scanner;

public class RotateArrayByK {
    public static void rotateByK(int[] arr, int k, String rotationDir) {
        // 1st Method - TC => O(N^2) | SC => O(1)
        int n = arr.length;
        if (rotationDir.equals("right")) {
            for (int j=1; j<=k; j++) {
                int temp = arr[n-1];
                for (int i = 0; i < n - 1; i++) {
                    arr[n - i - 1] = arr[n - i - 2];
                }
                arr[0] = temp;
            }
            System.out.print("Rotated array to the right by " + k + " is : ");
            for (int j : arr) {
                System.out.print(j+ " ");
            }
        } else if (rotationDir.equals("left")) {
            for (int j=0; j<k; j++) {
                int temp = arr[0];
                for (int i = 0; i < n - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[n - 1] = temp;
            }
            System.out.print("Rotated array to the left by " + k + " is : ");
            for (int j : arr) {
                System.out.print(j+ " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rotations : ");
        int k = scanner.nextInt();
        System.out.print("Enter the rotation direction : ");
        String rotationDir = scanner.next();

        int[] arr = {1,2,3,4,5,6,7};
        rotateByK(arr, k, rotationDir);
    }
}
