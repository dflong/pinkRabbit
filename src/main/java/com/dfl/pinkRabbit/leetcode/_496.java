package com.dfl.pinkRabbit.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class _496 {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int i = 1; i < nums2.length; i++) {
            while (!stack.isEmpty() && nums2[stack.peek()] < nums2[i]) {
                Integer pop = stack.pop();
                map.put(nums2[pop], nums2[i]);
            }
            stack.push(i);
        }

        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i ++) {
            res[i] = map.getOrDefault(nums1[i], - 1);
        }

        return res;
    }
}
