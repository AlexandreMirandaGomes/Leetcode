package org.leetcode.isomorphic_string_205;

import java.util.HashMap;

public class Solution1 {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "qwtw";
        System.out.println(isIsomorphic(s, t));
    }

    private static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        HashMap<Character, Character> mapping = new HashMap<>();
        HashMap<Character, Boolean> mapped = new HashMap<>();

        for (int i = 0; i < sChars.length; i++) {
            char sChar = sChars[i];
            char tChar = tChars[i];

            if(!mapping.containsKey(sChar)) {
                if (mapped.containsKey(tChar) && mapped.get(tChar)) return false;
                mapping.put(sChar, tChar);
                mapped.put(tChar, true);
            } else {
                if(mapping.get(sChar) != tChar) {
                    return false;
                }
            }
        }
        return true;
    }
}
