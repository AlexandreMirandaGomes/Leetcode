package org.leetcode.random_note_383;


import java.util.HashMap;

public class Solution1 {

    public static void main(String[] args) {
        String ransomNote = "rr";
        String maganize = "rraaab";
        System.out.println(canConstruct(ransomNote, maganize));
    }

    private static boolean canConstruct(String ransomNote, String magazine) {
        char[] magazineChars = magazine.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c : magazineChars) {
            if (hashMap.get(c) == null) {
                hashMap.put(c, 1);
            } else {
                int freq = hashMap.get(c) + 1;
                hashMap.replace(c, freq);
            }
        }
        char[] ransomChars = ransomNote.toCharArray();
        for (char c : ransomChars) {
            if(hashMap.get(c) == null || hashMap.get(c) - 1 < 0) {
                return false;
            }
            int freq = hashMap.get(c) - 1;
            hashMap.replace(c, freq);
        }
        return true;
    }
}
