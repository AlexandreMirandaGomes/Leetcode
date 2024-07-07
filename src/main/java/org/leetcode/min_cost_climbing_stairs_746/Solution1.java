package org.leetcode.min_cost_climbing_stairs_746;

public class Solution1 {

    public static void main(String[] args) {
        int[] cost = {10, 15, 25};
        System.out.println(minCostClimbingStairs(cost));
    }

    private static int minCostClimbingStairs(int[] cost) {

        //a sacada desse exercicio é que se faz uma matriz do mesmo tamanho do cost que será uma matriz que cada elemento registro o custo acumulado.
        //os dois primeiros são fixos, porque podem ser o inicio
        // a partir dai, para popular um indice, é considerado o custo atual mais o menor custo entre os dois ultimos
        //por fim, se pega o menor custo entre o ultimo e o penultimo
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];

        for(int i = 2; i < dp.length; i++) {
            dp[i] = cost[i] + Math.min(dp[i-1], dp[i-2]);
        }
        int lastIndex = dp.length - 1;
        return Math.min(dp[lastIndex], dp[lastIndex - 1]);
    }
}
