package com.dfl.pinkRabbit.leetcode0;

public class _746 {

    public static void main(String[] args) {
        new _746().minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1});
    }

    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i <= cost.length; i++) {
            dp[i] = Math.min(dp[i - 2] + cost[i - 2], dp[i - 1] + cost[i - 1]);
        }
        return dp[cost.length];
    }
}
