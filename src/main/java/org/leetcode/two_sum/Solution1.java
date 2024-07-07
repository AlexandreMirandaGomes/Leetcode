package org.leetcode.two_sum;


import java.util.Arrays;

public class Solution1 {
    public static void main(String[] args) {

        int[] nums = new int[]{3, 3};
        int target = 6;

        int[] answer = new int[2];

        loop:
        for (int i = 0; i < nums.length; i++) {
            for (int z = 0; z < nums.length; z++) {
                if (i != z && nums[i] + nums[z] == target) {
                    answer[0] = i;
                    answer[1] = z;
                    break loop;
                }
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}

