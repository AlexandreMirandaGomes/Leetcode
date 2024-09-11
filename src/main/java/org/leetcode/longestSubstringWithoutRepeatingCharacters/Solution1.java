package org.leetcode.longestSubstringWithoutRepeatingCharacters;


public class Solution1 {

    public static void main(String[] args) {
        String s = "ababab";
        System.out.println(longestLengthWithoutRepeatingChars(s));
    }

    private static int longestLengthWithoutRepeatingChars(String s) {
        int longestLength = 0;
        String currString = "";

        for(int r = 0; r < s.length(); r++) {
            for(int z = 0; z < currString.length(); z++) {
                if(currString.charAt(z) == s.charAt(r)) {
                    currString = currString.substring(z + 1, currString.length());
                }
            }
            currString +=  s.charAt(r);
            longestLength = Math.max(currString.length(), longestLength);
        }

        return longestLength ;
    }
}
