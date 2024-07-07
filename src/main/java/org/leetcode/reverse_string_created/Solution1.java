package org.leetcode.reverse_string_created;

public class Solution1 {

    public static void main(String[] args) {
        String s = "abcde";
        System.out.println(reverseString(s));
    }

    private static String reverseString(String s) {
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()) {
            sb.insert(0,c);
        }

        return sb.toString();
    }
}
