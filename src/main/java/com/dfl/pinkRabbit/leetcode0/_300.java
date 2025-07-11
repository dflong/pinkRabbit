package com.dfl.pinkRabbit.leetcode0;

import java.util.Arrays;

public class _300 {

    public int lengthOfLIS(int[] nums) {
       int[] dp = new int[nums.length];
       Arrays.fill(dp, 1);
       int res = 1;
       for (int i = 1; i < nums.length; i++) {
           for (int j = 0; j < i; j++) {
               if (nums[i] > nums[j]) {
                   dp[i] = Math.max(dp[i], dp[j] + 1);
               }
               res = Math.max(res, dp[i]);
           }
       }
       return res;
    }
}
