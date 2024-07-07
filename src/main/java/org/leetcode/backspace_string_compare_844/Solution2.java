package org.leetcode.backspace_string_compare_844;

import java.util.Stack;

public class Solution2 {
    public static void main(String[] args) {
        String s = "y#fo##f";
        String t = "y#f#o##f";
        System.out.println(backspaceComparare(s, t));
    }

    private static boolean backspaceComparare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c != '#') {
                stack1.push(c);
            } else if (!stack1.isEmpty()) {
                stack1.pop();
            }
        }
        Stack<Character> stack2 = new Stack<>();
        for (char c : t.toCharArray()) {
            if (c != '#') {
                stack2.push(c);
            } else if (!stack2.isEmpty()) {
                stack2.pop();
            }
        }
        return stack1.equals(stack2);
    }

}
