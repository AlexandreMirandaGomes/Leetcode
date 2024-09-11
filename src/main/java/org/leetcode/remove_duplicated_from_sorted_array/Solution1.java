package org.leetcode.remove_duplicated_from_sorted_array;

public class Solution1 {

    public static void main(String[] args) {
        int[] nums = {1,2,2};
        System.out.println(removeDuplicate(nums));
    }

    private static int removeDuplicate(int[] nums) {
        int j = 1;
        for(int i = 1; i < nums.length; i++) {
            if(j == 1 || nums[i] != nums[j - 2]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
