package Recursion;

public class StringPalindromeRecursively {
    public static boolean isPalindrome(String s, int first, int last) {
        if (first >= last) return true;
        if (s.charAt(first) != s.charAt(last)) return false;
        return isPalindrome(s, first+1, last-1);
    }
    public static void main(String[] args) {
        String s = "ANBCDCBNA";
        boolean result = isPalindrome(s, 0, s.length()-1);
        System.out.print(result);
    }
}
