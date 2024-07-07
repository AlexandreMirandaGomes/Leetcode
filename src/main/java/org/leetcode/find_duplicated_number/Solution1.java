package org.leetcode.find_duplicated_number;

public class Solution1 {

    public static void main(String[] args) {
        int[] numbers = {1,3,4,2,2};
        System.out.println(findDuplicatedNumber(numbers));
    }

    private static int findDuplicatedNumber(int[] nums) {

        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }
        return 0;
    }
}
