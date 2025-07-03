package com.dfl.pinkRabbit.leetcode0;

import java.util.ArrayList;
import java.util.List;

public class _77 {

    public List<List<Integer>> combine(int n, int k) {
        this.n = n;
        this.k = k;
        dfs(1);
        return res;
    }

    int n, k;
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public void dfs(int index) {
        if (list.size() == k) {
            res.add(new ArrayList<>(list));
            return;
        }
        if (list.size() + (n - index) < k) return;
        for (int i = index; i <= n; i++) {
            list.add(i);
            dfs(i + 1);
            list.remove(list.size() - 1);
        }
    }
}
