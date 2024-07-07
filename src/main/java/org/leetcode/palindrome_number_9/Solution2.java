package org.leetcode.palindrome_number_9;

public class Solution2 {

    public static void main(String[] args) {
        int number = 1221;
        isPalindrome(number);

    }

    private static boolean isPalindrome(int x) {

        String value = String.valueOf(x);

        StringBuilder sb = new StringBuilder(value);

        return sb.reverse().toString().equals(value);
    }


}
