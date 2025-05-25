package Recursion;

public class FibonacciSpaceOptimize {
    public static void main(String[] args) {
        int n = 5;
        if (n == 0) {
            System.out.print(0);
        } else {
            int secondLast = 0;
            int last = 1;
            System.out.println("The fibonacci series up to " + n + "th term is : ");
            System.out.print(secondLast + " " + last + " ");
            int curr;
            for (int i = 2; i <= n; i++) {
                curr = secondLast + last;
                secondLast = last;
                last = curr;
                System.out.print(curr + " ");
            }
        }
    }
}
