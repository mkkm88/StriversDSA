package Patterns.Numbers;

public class SolidRectangleNumber {
    public static void pattern22(int n) {
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                // Initialising the top, down, left and right indices of a cell.
                int bottom = (2*n - 2) - i;
                int right = (2*n - 2) - j;
                System.out.print(n - Math.min(Math.min(i,bottom), Math.min(j,right)) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 9;
        pattern22(n);
    }
}
