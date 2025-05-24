package Recursion;

public class StringPalindrome {
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right){
            // 1st Method : Kasim
            /*if (s.charAt(left) != s.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }*/

            // 2nd Method : Strivers Approach
            char l= s.charAt(left);
            char r = s.charAt(right);
            if (!Character.isLetterOrDigit(l)) left++;
            else if (!Character.isLetterOrDigit(r)) right--;
            else if (Character.toLowerCase(l) != Character.toLowerCase(r)) return false;
            else left++; right--;
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


