package com.dfl.pinkRabbit.leetcode0;

public class _112 {

    public boolean hasPathSum(TreeNode1 root, int targetSum) {
        if (root == null) return false;
        if (root.left == null && root.right == null) return targetSum == root.val;
        return hasPathSum(root.left, targetSum - root.val) ||
                hasPathSum(root.right, targetSum - root.val);
    }
}
