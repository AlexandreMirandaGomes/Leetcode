package org.leetcode.length_of_last_word_58;

public class Solution2 {

    public static void main(String[] args) {
        String s = "fsaufsahuf  aa asdfsa   asa";
        System.out.println(lengthOfLastWord(s));
    }

    private static int lengthOfLastWord(String s) {
        String newString = s.trim();
        int count = 0;
        int i = newString.length() - 1;
        while(i >= 0 && newString.charAt(i) != ' ') {
            count++;
            i--;
        }
        return count;
    }

}
