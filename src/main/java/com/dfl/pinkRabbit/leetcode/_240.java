package com.dfl.pinkRabbit.leetcode;

public class _240 {

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int i = m - 1, j = 0;

        while (i >= 0 && j < n) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] > target) {
                i --;
            } else {
                j ++;
            }
        }

        return false;
    }
}
