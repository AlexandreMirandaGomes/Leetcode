package org.leetcode.two_sum_2_Input_array_is_sorted;

import java.util.Arrays;

public class Solution1 {
    public static void main(String[] args) {
        int[] numbers = {2,3,4};
        int target = 6;
        System.out.println(twoSum(numbers, target));
    }

    private static String twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        for(int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if(target == numbers[i] + numbers[j]) {
                    result[0] = i + 1;
                    result[1] = j + 1;
                    return Arrays.toString(result);
                }
            }
        }
        return Arrays.toString(result);
    }
}
