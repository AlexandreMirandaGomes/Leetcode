package org.leetcode.remove_duplicated_letters_316;


import java.util.Stack;

public class Solution3 {
    public static void main(String[] args) {
        String s = "bcabc";
        System.out.println(removeDuplicateAndLexicoSmaller(s));
    }


    private static String removeDuplicateAndLexicoSmaller(String s) {
        int[] lastIndex = new int[26];
        boolean[] used = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char actualChar = s.charAt(i);

            while (!stack.isEmpty() && actualChar < stack.peek() && i < lastIndex[stack.peek() - 'a']) {
                used[stack.pop() - 'a'] = false;
            }

            if (!used[actualChar - 'a']) {
                stack.push(actualChar);
                used[actualChar - 'a'] = true;
            }

        }
        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }

        return sb.toString();

        //praticando a solução

    }
}
