package org.leetcode.find_the_difference_389;

import org.apache.commons.lang3.StringUtils;

public class Solution1 {

    public static void main(String[] args) {
        String s = "a";
        String t = "aa";
        System.out.println(findDifference(s, t));
    }

    private static char findDifference(String s, String t) {

        for(int i =0; i < t.length(); i++) {
            char charSearched = t.charAt(i);
            if(!s.contains(String.valueOf(charSearched))) {
                return charSearched;
            }
            int charOcurrences = StringUtils.countMatches(t, String.valueOf(s.charAt(i)));
            if(charOcurrences != 1) {
                return charSearched;
            }
        }

        return 0;

        //essa solução não serve para o LeetCode pq não tem a dependência do commons-lang3

    }
}
