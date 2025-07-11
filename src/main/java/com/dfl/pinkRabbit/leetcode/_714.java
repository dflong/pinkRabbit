package com.dfl.pinkRabbit.leetcode;

public class _714 {

    public int maxProfit(int[] prices, int fee) {
        // dp[i][0] 买入 dp[i][1] 卖出
        int[][] dp = new int[prices.length][2];

        // dp[i][0] = max(dp[i - 1][0], dp[i - 1][1] - prices[i]
        // dp[i][1] = max(dp[i - 1][1], dp[i - 1][0] + prices[i] - fee)

        // 初始化
        dp[0][0] = - prices[0];

        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] - prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] + prices[i] - fee);
        }

        return dp[prices.length - 1][1];
    }
}
