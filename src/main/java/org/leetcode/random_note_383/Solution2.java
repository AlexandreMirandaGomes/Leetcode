package org.leetcode.random_note_383;


public class Solution2 {

    public static void main(String[] args) {
        String ransomNote = "rr";
        String maganize = "rraaab";
        System.out.println(canConstruct(ransomNote, maganize));
    }

    private static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        int[] alphabetsCounter = new int[26];

        for (char c : magazine.toCharArray())
            alphabetsCounter[c-'a']++;

        for (char c : ransomNote.toCharArray()){
            if (alphabetsCounter[c-'a'] == 0) return false;
            alphabetsCounter[c-'a']--;
        }
        return true;
    }
}
