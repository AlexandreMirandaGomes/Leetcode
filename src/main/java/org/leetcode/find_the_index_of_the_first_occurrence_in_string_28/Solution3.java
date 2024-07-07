package org.leetcode.find_the_index_of_the_first_occurrence_in_string_28;

public class Solution3 {

    public static void main(String[] args) {
        String haystack = "a";
        String needle = "a";
        System.out.println(strStr(needle, haystack));
    }

    private static int strStr(String needle, String haystack) {
        if (!haystack.contains(needle)) {
            return -1;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;
            while (haystack.charAt(i + j) == needle.charAt(j) && j < needle.length()) {
                j++;
                if (j == needle.length()) {
                    return i;
                }
            }
        }
        return -1;
    }
}