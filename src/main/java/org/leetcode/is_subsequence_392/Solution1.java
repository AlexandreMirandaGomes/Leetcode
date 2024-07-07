package org.leetcode.is_subsequence_392;

public class Solution1 {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }

    private static boolean isSubsequence(String s, String t) {

        if("".equals(s)) {
            return true;
        }
        int sIndex = 0;
        for(int i = 0; i < t.length(); i++) {
            if(t.charAt(i) == s.charAt(sIndex)) {
                if(sIndex == s.length() - 1) {
                    return true;
                }
                sIndex++;
            }
        }
        return false;
    }
}
