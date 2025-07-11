package com.dfl.pinkRabbit.leetcode;

public class _209 {

    public int minSubArrayLen(int target, int[] nums) {
        int i = 0, j = 0, sum = 0, min = Integer.MAX_VALUE;

        while (j < nums.length) {
            sum += nums[j ++];
            while (sum >= target) {
                min = Math.min(min, j - i);
                sum -= nums[i];
                i ++;
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
