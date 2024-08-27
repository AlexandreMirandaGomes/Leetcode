package org.leetcode.minimum_size_subarray_sum;

public class Solution1 {

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(minSubArrayLen(nums, target));
    }

    private static int minSubArrayLen(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        for(int end = 0; end < n; end++) {
            sum += nums[end];
            while(sum >= target) {
                int curLength = end - start + 1;
                minLength = Math.min(minLength, curLength);
                sum -= nums[start];
                start++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
