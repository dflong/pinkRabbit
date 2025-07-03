package com.dfl.pinkRabbit.leetcode;

public class _233 {

    public static void main(String[] args) {
        new _233().countDigitOne(13);
    }

    public int countDigitOne(int n) {

        String s = Integer.toString(n);

        if (s.length() == 1) return n > 0 ? 1 : 0;

        // 按数位讨论
        int[] prefix = new int[s.length()];
        int[] suffix = new int[s.length()];

        for (int i = 1; i < s.length() - 1; i ++) {
            prefix[i] = Integer.parseInt(s.substring(0, i));
            suffix[i] = Integer.parseInt(s.substring(i + 1));
        }
        suffix[0] = Integer.parseInt(s.substring(1));
        prefix[s.length() - 1] = Integer.parseInt(s.substring(0, s.length() - 1));

        int res = 0;
        for (int i = 0; i < s.length(); i ++) {
            int x = s.charAt(i) - '0';
            int len = s.length() - i - 1;

            int total = 0;
            total += prefix[i] * Math.pow(10, len); // 前缀小于

            // 前缀等于
            if (x == 0) {
                // 0
            } else if (x == 1) {
                total += suffix[i] + 1;
            } else {
                total += Math.pow(10, len);
            }

            res += total;
        }

        return res;
    }
}
