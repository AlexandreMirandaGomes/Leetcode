package org.leetcode.remove_element_27;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        int[] nums = new int[]{3,2,2,3};
        int val = 3;

        int count = 0;
        // Loop through all the elements of the array
        for (int i = 0; i < nums.length; i++) {
            // If the element is not val
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        int k = count;
        System.out.println(Arrays.toString(nums));
        System.out.println(k);
    }
}
