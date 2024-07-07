package org.leetcode.longest_common_prefix_14;

public class Solution3 {

    public static void main(String[] args) {
        String[] input = {"abcd", "abce", "gggggg"};
        System.out.println(findCommonPrefix(input));
    }

    private static String findCommonPrefix(String[] strs) {

        if(strs == null || strs.length == 0) {
            return null;
        }

        int minLen = Integer.MAX_VALUE;

        for(String str : strs) {
            minLen = Math.min(minLen, str.length());
        }

        for(int i = 0; i < minLen; i++) {
            char c = strs[0].charAt(i);

            for(int j = 1; j < strs.length; j++) {
                if(strs[j].charAt(i) != c) {
                    return strs[j].substring(0, i);
                }
            }
        }
        return strs[0].substring(0, minLen);

    }
}
