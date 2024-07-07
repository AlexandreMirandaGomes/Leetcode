package org.leetcode.two_sum;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int requiredNumber = target - nums[0];
            if(map.containsKey(requiredNumber)) {
                return new int[]{map.get(requiredNumber), i};
            }
            map.put(nums[i],i);
        }
        return null;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
    }
}