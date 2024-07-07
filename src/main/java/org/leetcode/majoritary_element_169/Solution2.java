package org.leetcode.majoritary_element_169;

import java.util.Arrays;

public class Solution2 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 1, 1, 1, 1, 1, 1, 2, 2};
        System.out.println(majoritaryElement(nums));
    }

    private static int majoritaryElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
