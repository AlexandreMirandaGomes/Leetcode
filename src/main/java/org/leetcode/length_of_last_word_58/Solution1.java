package org.leetcode.length_of_last_word_58;

public class Solution1 {

    public static void main(String[] args) {
        String s = "a";
        System.out.println(lengthOfLastWord(s));
    }

    private static int lengthOfLastWord(String s) {
        String[] strings = s.trim().split(" ");

        int lastIndex = strings.length - 1;
        if(lastIndex == 0) {
            return strings[0].length();
        }
        for (int i = lastIndex ; i >= 1; i --) {
            return strings[i].length();
        }
        return 0;
    }

}
