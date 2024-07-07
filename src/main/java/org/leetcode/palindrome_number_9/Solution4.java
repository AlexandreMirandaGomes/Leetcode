package org.leetcode.palindrome_number_9;

public class Solution4 {

    public static void main(String[] args) {
        Solution4 solution = new Solution4();
        int number = 1;
        System.out.println(isPalindrome(number));

    }

    private static boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int temp = x;
        int rev = 0;

        while (temp != 0) {
            rev = (rev * 10) + (temp % 10);
            temp = temp / 10;
        }
        return x == rev;

    }


}
