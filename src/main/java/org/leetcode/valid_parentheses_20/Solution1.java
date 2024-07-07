package org.leetcode.valid_parentheses_20;

import java.util.Stack;

public class Solution1 {

    public static void main(String[] args) {
        String s = "([]{})";
        System.out.println(isValid(s));
    }

    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            }
            else if (c == '[') {
                stack.push(']');
            }
            else if (c == '{') {
                stack.push('}');
            }
            else if (stack.isEmpty() || c != stack.pop()) {
                return false;
            }
        }
        return stack.isEmpty();

    }

}
