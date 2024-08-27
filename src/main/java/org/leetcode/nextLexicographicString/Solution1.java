package org.leetcode.nextLexicographicString;

import java.util.Arrays;

public class Solution1 {

    public static void main(String[] args) {
        String s = "abec";
        System.out.println(nextGreaterPermutationString(s));
    }

    private static String nextGreaterPermutationString(String s) {

        char[] arr = s.toCharArray();
        int n = arr.length;
        int i = n - 2;

        while(i >= 0 && arr[i] >= arr[i+1]) {
            i--;
        }

        if(i == -1) {
            return String.valueOf(i);
        }

        int greaterAndSmallestIndex = i + 1;
        for (int j = i + 1; j < n; j++) {
            if (arr[j] > arr[i] && arr[j] < arr[greaterAndSmallestIndex]) {
                greaterAndSmallestIndex = j;
            }
        }

        swapChars(i , greaterAndSmallestIndex, arr);

        Arrays.sort(arr, i + 1, n);

        return Arrays.toString(arr);
    }

    private static void swapChars(int i, int j, char[] arr) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static char[] swapValues(int i, int j, char[] array) {
        array[i] = array[j];
        array[j] = array[i];
        return array;
    }
}
