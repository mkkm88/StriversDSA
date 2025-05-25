package Recursion;

public class FibonacciRecursively {
    public static int printFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int last = printFibonacci(n-1);
        int slast = printFibonacci(n-2);
        return last + slast;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(printFibonacci(n));
    }
}
