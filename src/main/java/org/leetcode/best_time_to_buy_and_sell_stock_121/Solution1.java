package org.leetcode.best_time_to_buy_and_sell_stock_121;

public class Solution1 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxprofit(prices));
    }

    private static int maxprofit(int[] prices) {
        int len = prices.length;
        int profit = 0;
        for(int i = 0; i < len - 1; i++) {
            for(int j = i + 1 ; j < len ; j++) {
                if(prices[j] - prices[i] > profit) {
                    profit = prices[j] - prices[i];
                }
            }
        }
        return profit;
        //funcionou, mas não está otimizado. Não tem necessidade de fazer 2 loops aqui.
        //Se eu sei que tem um preço menos, não tem pq iterar com todos os outros no preço que estou.
    }
}
