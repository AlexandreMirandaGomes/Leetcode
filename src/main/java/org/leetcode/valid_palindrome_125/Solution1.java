package org.leetcode.valid_palindrome_125;

public class Solution1 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    private static boolean isPalindrome(String s) {
        String treatedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder();

        for (char c : treatedString.toCharArray()) {
            sb.insert(0, c);
        }

        return sb.toString().equals(treatedString);
    }

}

