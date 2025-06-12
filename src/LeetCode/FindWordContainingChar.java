package LeetCode;

import java.util.*;

public class FindWordContainingChar {
    public static List<Integer> findWordsContaining(String[] words, int n, char x) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0; i<n; i++) {
            if (words[i].contains(String.valueOf(x))) {
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        String[] words = {"abc","bcd","aaaa","cbc"};
        char x = 'e';
        int n = words.length;

        List<Integer> list = findWordsContaining(words, n, x);
        System.out.println(list);
    }
}
