package org.leetcode.the_k_weakest_rows_in_matrix_1337;

import java.util.*;

public class Solution1 {

    public static void main(String[] args) {

        int[][] mat = {{1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}};
        int k = 3;

        System.out.println(Arrays.toString(KWeakestRows(mat, k)));
    }

    private static int[] KWeakestRows(int[][] mat, int k) {

        int[][] rowStrengths = new int[mat.length][2];

        for (int i = 0; i < mat.length; i++) {
            int strength = 0;
            for (int val : mat[i]) {
                strength += val;
            }
            rowStrengths[i][0] = strength;
            rowStrengths[i][1] = i;
        }
        //vale a pena explorar a ordenação de um array com duas dimensões
        //Arrays.sort(rowStrengths, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        Arrays.sort(rowStrengths, Comparator.comparingInt(a -> a[0]));

        int[] answer = new int[k];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = rowStrengths[i][1];
        }

        return answer;
    }


}
