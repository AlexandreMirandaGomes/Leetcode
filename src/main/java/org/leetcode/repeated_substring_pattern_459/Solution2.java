package org.leetcode.repeated_substring_pattern_459;

public class Solution2 {

    public static void main(String[] args) {
        String s = "abcabc";
        System.out.println(repeatedSubstringPattern(s));
    }

    private static boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for (int i = len / 2; i >= 1; i--) {
            if (len % i == 0) {
                int numReps = len / i;
                String substring = s.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < numReps; j++) {
                    sb.append(substring);
                }
                if (sb.toString().equals(s)) return true;
            }
        }
        return false;
    }
}
