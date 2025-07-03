package com.dfl.pinkRabbit.leetcode;

import java.util.*;

public class _491 {

    public static void main(String[] args) {
        new _491().findSubsequences(new int[] {4, 6, 7, 7});
    }

    public List<List<Integer>> findSubsequences(int[] nums) {
        this.nums = nums;
        backTracking(0);
        return res;
    }

    int[] nums;
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    public void backTracking(int idx) {
        if (list.size() >= 2) {
            res.add(new ArrayList<>(list));
        }

        Set<Integer> set = new HashSet<>();
        for (int i = idx; i < nums.length; i++) {
            if ((list.size() > 0 && list.get(list.size() - 1) > nums[i]) // 保证递增
            || set.contains(nums[i])) { // 同一父节点同层去重
                continue;
            }
            set.add(nums[i]);
            list.add(nums[i]);
            backTracking(i + 1);
            list.remove(list.size() - 1);
        }
    }

}
