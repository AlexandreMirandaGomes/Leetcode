package org.leetcode.find_the_difference_389;

public class Solution2 {

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println(findDifference(s, t));
    }

    private static char findDifference(String s, String t) {

        int sOccurrences = 0;
        int tOccurrences = 0;
        for(int i =0; i < t.length(); i++) {
            char charSeached = t.charAt(i);
            for(int z = 0; z < t.length(); z++) {
                if(charSeached == t.charAt(z)) {
                    tOccurrences++;
                }
            }
            for(int j = 0; j < s.length(); j++) {
                if(t.charAt(i) == s.charAt(j)) {
                    sOccurrences++;
                }
            }
            if(tOccurrences != sOccurrences) {
                return charSeached;
            }
        }
        return 0;

    }
}
