package org.leetcode.word_pattern_290;

import java.util.HashMap;

public class Solution1 {
    public static void main(String[] args) {
        String s = "dog dog dog dog";
        String pattern = "abba";
        System.out.println(respectPattern(s, pattern));
    }

    private static boolean respectPattern(String s,String pattern) {
        if(s == null) return false;
        String[] stringWords = s.split(" ");
        char[] charsPattern = pattern.toCharArray();
        if(stringWords.length != pattern.length()) return false;

        HashMap<Character, String> hashMap = new HashMap<>();

        for(int i = 0; i < charsPattern.length; i++) {
            char c = charsPattern[i];
            String word = stringWords[i];
            if(hashMap.containsKey(c)) {
                if(!hashMap.get(c).equals(word)) return false;
            } else {
                if(hashMap.containsValue(word)) return false;
                hashMap.put(charsPattern[i], stringWords[i]);
            }

        }
        return true;
    }
}
