package org.leetcode.nextLexicographicString;

import java.util.Arrays;

public class Solution2 {

    public static void main(String[] args) {
        String s = "abced";
        System.out.println(nextLexicographString(s));
    }

    private static String nextLexicographString(String s) {
        char[] arr = s.toCharArray();
        int n = s.length();
        int i = n - 2;

        while(i >= 0 && arr[i] >= arr[i+1]) {
            i--;
        }

        if(i == -1) {
            return "-1";
        }

        int greaterIndex = i + 1;
        int j;
        for(j = i + 1; j < n; j++) {
            if(arr[j] > arr[i] && arr[j] < arr[greaterIndex]) {
                greaterIndex = j;
            }
        }

        swapChar(i, greaterIndex, arr);

        Arrays.sort(arr, i + 1, n);

        for(int z = 0; z < n - 1; z++) {
            if(arr[z] == arr[z+1]) {
                return "-1";
            }
        }

        return new String(arr);
    }

    private static void swapChar(int i, int greaterIndex, char[] arr) {
        char temp = arr[i];
        arr[i] = arr[greaterIndex];
        arr[greaterIndex] = temp;
    }
}
