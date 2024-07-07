package org.leetcode.palindrome_number_9;

public class Solution3 {

    public static void main(String[] args) {
        int number = 1221;
        isPalindrome(number);

    }

    private static boolean isPalindrome(int x) {

        if(x < 0) {
            return false;
        }

        int temp = x;
        int rev = 0;

        while(temp!=0){
            rev=(rev*10)+(temp%10);
            temp=temp/10;
        }
        System.out.println(rev);
        return x==rev;
    }


}
