package org.leetcode.majoritary_element_169;


public class Solution1 {

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 1, 1, 1, 1, 1, 1, 2, 2};
        System.out.println(majoritaryElement(nums));
    }

    private static int majoritaryElement(int[] nums) {
        int count = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    if (count > len / 2) {
                        return nums[i];
                    }
                }
            }
            count = 0;
        }
        return 0;

    }
}
