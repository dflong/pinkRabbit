package com.dfl.pinkRabbit.leetcode;

public class _374 {

    int guess(int num){
        return 0;
    }

    public int guessNumber(int n) {
        int l = 1, r = n;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (guess(mid) == 0) return mid;
            if (guess(mid) < 0) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}
