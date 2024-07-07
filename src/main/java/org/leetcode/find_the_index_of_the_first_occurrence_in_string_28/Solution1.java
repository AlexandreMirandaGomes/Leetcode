package org.leetcode.find_the_index_of_the_first_occurrence_in_string_28;

public class Solution1 {

    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issip";
        System.out.println(strStr(needle, haystack));
    }

    private static int strStr(String needle, String haystack) {
        if (haystack.contains(needle)) {
            for (int i = 0; i < haystack.length(); i++) {
                if (needle.equals(haystack.substring(i, i + needle.length()))) {
                    return i;
                }
            }
        }
        return -1;
    }
}