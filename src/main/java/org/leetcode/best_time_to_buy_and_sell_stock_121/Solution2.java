package org.leetcode.best_time_to_buy_and_sell_stock_121;

public class Solution2 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxprofit(prices));
    }

    private static int maxprofit(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int pist = 0;
        int op = 0;

        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < lsf) {
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(pist > op) {
                op = pist;
            }
        }

        return op;

    }
}
