package com.dfl.pinkRabbit.leetcode;

import java.util.*;

public class _315 {

    public static void main(String[] args) {
        new _315().countSmaller(new int[]{5,2,6,1});
    }

    public List<Integer> countSmaller(int[] nums) {
        List<Integer> res = new ArrayList<>();

        des(nums); // 离散
        init(a.length + 1); // 初始化

        for (int i = nums.length - 1; i >= 0; i --) {
            int id = getId(nums[i]);
            res.add(query(id - 1));
            update(id);
        }
        Collections.reverse(res);
        return res;
    }

    private void update(int idx) {
        while (idx < c.length) {
            c[idx] += 1;
            idx += lowBit(idx);
        }
    }

    private int query(int idx) {
        int res = 0;
        while (idx > 0) {
            res += c[idx];
            idx -= lowBit(idx);
        }
        return res;
    }

    private int lowBit(int x) {
        return x & (- x);
    }

    private int getId(int x) {
        return Arrays.binarySearch(a, x) + 1;
    }

    private void init(int size) {
        c = new int[size];
    }

    int[] a; // 离散后的数组
    int[] c; // 前缀和

    private void des(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        a = new int[set.size()];
        int idx = 0;
        for (Integer i : set) {
            a[idx ++] = i;
        }
        Arrays.sort(a);
    }

}
