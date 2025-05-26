package Hashing;

import java.util.Scanner;

public class CharacterHashing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = scanner.next();

        // precompute:
        int[] hash = new int[26];
        for (int i=0; i<s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }

        System.out.print("Enter the number of operations : ");
        int q = scanner.nextInt();
        while (q-- > 0) {
            char c = scanner.next().charAt(0);
            // fetch:
            System.out.println("The char " + c + " appears " + hash[c - 'a'] + " times");
        }
    }
}
