package org.leetcode.palindrome_number_9;

public class Solution {

    public static void main(String[] args) {
        int number = 1221;
        isPalindrome(number);

    }

    private static boolean isPalindrome(int x) {
        int lastPosition = String.valueOf(x).length() - 1;
        for(int i = 0;  i < String.valueOf(x).length() / 2; i++, lastPosition --)  {
            if(String.valueOf(x).charAt(i) != String.valueOf(x).charAt(lastPosition)) {
                return false;
            }
        }
        return true;
    }


}
