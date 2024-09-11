package org.leetcode.two_sum_2_Input_array_is_sorted;

import java.util.*;

public class Solution2 {
    public static void main(String[] args) {
        int[] numbers = {2,3,4};
        int target = 6;
        System.out.println(twoSum(numbers, target));
    }

    private static String twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        int[] ans = new int[2];

        while(i < j) {
            if(numbers[i] + numbers[j] == target) {
                ans[0] = i + 1;
                ans[1] = j + 1;
                return Arrays.toString(ans);
            }
            else {
                if(numbers[i] + numbers[j] < target) {
                    i++;
                } else {
                    j--;
                }
            }
        }
        return Arrays.toString(ans);
    }
}
