package com.dfl.pinkRabbit.leetcode0;

public class _48 {

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] newMatrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                newMatrix[j][n - i - 1] = matrix[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = newMatrix[i][j];
            }
        }
    }
}
