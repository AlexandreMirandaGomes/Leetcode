package org.leetcode.repeated_substring_pattern_459;

public class Solution1 {

    public static void main(String[] args) {
        String s = "abcabcabc";
        System.out.println(repeatedSubstringPattern(s));
    }

    private static boolean repeatedSubstringPattern(String s) {

        StringBuilder possiblePattern = new StringBuilder();
        possiblePattern.append(s.substring(0, 1));


        for (int i = 1; i <= s.length() / 2; i++) {
            if (s.length() % possiblePattern.length() != 0) {
                possiblePattern.append(s.substring(i, i + 1));
                continue;
            }
            int patternMatches = 1;
            for (int z = 1; z < s.length() / possiblePattern.length(); z++) {
                String actualString = s.substring(i * z, i + (z * possiblePattern.length()));
                if (!possiblePattern.toString().equals(actualString)) {
                    possiblePattern.append(s.substring(i, i + 1));
                    break;
                } else {
                    patternMatches++;
                }
                if(patternMatches == s.length() / possiblePattern.length() ) {
                    return true;
                }
            }
        }
        return false;
    }
}
