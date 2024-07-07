package org.leetcode.find_duplicated_number;

import java.util.HashSet;

public class Solution2 {

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println(findDuplicatedNumber(nums));
    }

    private static int findDuplicatedNumber(int[] nums) {

        //hashset não permite duplicatas, tentando adicionar, ao retornar false ele retorna o numero

        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            if(!set.add(num)) {
                return num;
            }
        }
        return -1;
    }
}
