package org.leetcode.find_the_difference_389;

public class Solution3 {

    public static void main(String[] args) {
        String s = "a";
        String t = "aa";
        System.out.println(findDifference(s, t));
    }

    private static char findDifference(String s, String t) {

        char c = 0;
        for (char cs : s.toCharArray()) {
            c ^= cs;
        }
        for (char ct : t.toCharArray()) {
            c ^= ct;
        }
        return c;

    }
}
