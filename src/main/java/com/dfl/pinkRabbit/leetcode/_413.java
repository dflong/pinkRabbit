package com.dfl.pinkRabbit.leetcode;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

public class _413 {

    public static void main(String[] args) {
        _413 v = new _413();
        v.numberOfArithmeticSlices(new int[]{1,2,3,4});
        // 1,2,3
        // 2,3,4
        // 3,4,5
        // 4,5,6
        // 1,3,5
        // 2,4,6
        // 1,2,3,4
        // 2,3,4,5
        // 3,4,5,6
        // 1,2,3,4,5
        // 2,3,4,5,6
        // 1,2,3,4,5,6
    }

    public int numberOfArithmeticSlices(int[] nums) {
        this.nums = nums;
        dfs(0);
        return res;
    }

    int res = 0;
    List<Integer> path = new ArrayList<>();
    int k = 0; // 等差
    int[] nums;
    public void dfs(int idx) {
        if (path.size() >= 3) {
            res ++;
        }

        for (int i = idx; i < nums.length; i ++) {
            if (path.isEmpty()) {
                path.add(i);
            } else if (path.size() == 1) {
                if (i - path.get(0) == 1) {
                    k = nums[i] - nums[path.get(0)];
                    path.add(i);
                } else {
                    return;
                }
            } else {
                if (i - path.get(path.size() - 1) == 1 && nums[i] - nums[path.get(path.size() - 1)] == k) {
                    path.add(i);
                } else {
                    return;
                }
            }
            dfs(i + 1);
            if (!path.isEmpty()) {
                path.remove(path.size() - 1);
            }
        }
    }
}
