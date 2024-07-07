package org.leetcode.remove_duplicated_letters_316;


import java.util.Stack;

public class Solution1 {
    public static void main(String[] args) {
        String s = "bcabc";
        System.out.println(removeDuplicateAndLexicoSmaller(s));
    }


    private static String removeDuplicateAndLexicoSmaller(String s) {
        int[] lastOccurrence = new int[26]; // to store the last occurrence index of each character
        boolean[] used = new boolean[26]; // to track if a character is already in the result

        // Initialize last occurrence index
        for (int i = 0; i < s.length(); i++) {
            lastOccurrence[s.charAt(i) - 'a'] = i;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // If the character is already in the result or smaller than the top of the stack,
            // and the top of the stack will appear later in the string, pop it.
            while (!stack.isEmpty() && currentChar < stack.peek() && i < lastOccurrence[stack.peek() - 'a']) {
                used[stack.pop() - 'a'] = false;
            }

            // If the character is not in the result, push it to the stack and mark it as used.
            if (!used[currentChar - 'a']) {
                stack.push(currentChar);
                used[currentChar - 'a'] = true;
            }
        }

        // Build the result string from the stack
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }

        return result.toString();
    }
}
