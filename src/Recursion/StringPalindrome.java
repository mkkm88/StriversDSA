package Recursion;

public class StringPalindrome {
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right){
            // 1st Method : Kasim
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "ABBABBABABA";
        boolean result = isPalindrome(s);
        if (result) {
            System.out.print(s + " is a palindrome");
        } else {
            System.out.print(s + " is not a palindrome");
        }
    }
}


