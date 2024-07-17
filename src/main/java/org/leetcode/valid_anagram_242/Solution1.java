package org.leetcode.valid_anagram_242;

import java.util.HashMap;

public class Solution1 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isValidAnagram(s, t));
    }

    private static boolean isValidAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        for(char c : t.toCharArray()) {
            if(hashMap.getOrDefault(c, 0) == 0) return false;
            hashMap.put(c, hashMap.get(c) - 1);
        }

        return true;
    }

}
