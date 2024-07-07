package org.leetcode.remove_duplicated_from_sorted_array_26;

public class Solution1 {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        System.out.println(removeDuplicates(nums));
    }

    private static int removeDuplicates(int[] nums) {
        int i = 0, size = nums.length;
        for(int j = 1; j < size; j++) {
            if(nums[i] != nums[j]) {
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i + 1;

    }
}
