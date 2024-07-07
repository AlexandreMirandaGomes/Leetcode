package org.leetcode.longest_common_prefix_14;


public class Solution1 {
    public static void main(String[] args) {
        String[] input = {"a"};
        System.out.println(findCommonPrefix(input));

    }

    private static String findCommonPrefix(String[] strs) {
        int arrayLength = strs.length;
        if(arrayLength == 1) {
            return strs[0];
        }
        int minorWordLength = strs[0].length();

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < minorWordLength) {
                minorWordLength = strs[i].length();
            }
        }

        StringBuilder sb = new StringBuilder();
        boolean addString = true;
        for (int i = 0; i < minorWordLength; i++) {
            String charToAdd = null;
            for (int z = 0; z < arrayLength; z++) {
                if (z == arrayLength - 1) {
                    continue;
                }
                if (strs[z].charAt(i) != strs[z + 1].charAt(i)) {
                    addString = false;
                }
                charToAdd = String.valueOf(strs[z].charAt(i));
            }
            if (addString) {
                sb.append(charToAdd);
                addString = true;
            }
        }
        return sb.toString();
    }
}
