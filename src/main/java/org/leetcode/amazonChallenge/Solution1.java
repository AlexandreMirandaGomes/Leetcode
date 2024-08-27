package org.leetcode.amazonChallenge;

import java.util.List;

public class Solution1 {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(getLargestIndexLen(List.of(1,2,3), List.of(1,2,3)));
    }

    public static int getLargestIndexLen(List<Integer> feature1, List<Integer> feature2) {
        // Write your code here
        int size = feature1.size();
        int result = 0;

        for(int i = 0; i < size; i++) {
            if(i+1 < size) {
                if((feature1.get(i) - feature1.get(i+1) > 0) && (feature2.get(i) - feature2.get(i+1) > 0)) {
                    result++;
                }
                else if((feature1.get(i) - feature1.get(i+1) < 0) && (feature2.get(i) - feature2.get(i+1) < 0)) {
                    result++;
                }
            }
        }
        return result;
    }
}
