package com.dfl.pinkRabbit.leetcode0;

public class _63 {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else if (i > 0 && j > 0) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                } else if (i > 0) {
                    dp[i][j] = dp[i - 1][j];
                } else if (j > 0) {
                    dp[i][j] = dp[i][j - 1];
                } else {
                    dp[i][j] = 1;
                }
            }
        }
        return dp[m - 1][n - 1];
    }
}
