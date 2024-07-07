package org.leetcode.sort_integers_by_the_number_of_1bits_1356;

import java.util.Arrays;

public class Solution1 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(sortByBits(arr)));
    }

    private static int[] sortByBits(int[] arr) {
        Integer[] wrappedArr = new Integer[arr.length];

        for(int i = 0; i < arr.length; i++) {
            wrappedArr[i] = arr[i];
        }

        Arrays.sort(wrappedArr, (a, b) -> {
            int countA = countBits(a);
            int countB = countBits(b);

            if(countA != countB) {
                return countA - countB;
            }
            return a - b;

        });

        for(int i = 0; i < arr.length; i++) {
            arr[i] = wrappedArr[i];
        }

        return arr;
    }

    private static int countBits(int num) {
        int count = 0;
        while(num > 0) {
            count += num & 1;
            num >>= 1;
        }
        return count;
    }
}
