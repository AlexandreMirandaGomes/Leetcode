package org.leetcode.merged_sorted_array_88;

import java.util.Arrays;
public class Solution {


    public static void main(String[] args) {

        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};

        for(int i = 0; i < nums2.length; i++) {
            nums1[nums1.length - 1 - i] = nums2[nums2.length -1 - i];
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
