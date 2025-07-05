package com.dfl.pinkRabbit.leetcode;

import java.util.Objects;

public class _331 {

    public static void main(String[] args) {
        new _331().isValidSerialization("9,3,4,#,#,1,#,#,2,#,6,#,#");
    }

    public boolean isValidSerialization(String preorder) {
        String[] charArray = preorder.split(",");
        for (int i = 0; i < charArray.length; i ++) {
            // 当前节点
            String cur = charArray[i];
            // 左右子节点
            if (Objects.equals(cur, "#")) { // 空节点，则不可能有子节点
                if (2 * i + 1 < charArray.length) {
                    return false;
                }

                if (!Objects.equals(charArray[i * 2], "#") || !Objects.equals(charArray[i * 2 + 1], "#")) {
                    return false;
                }
            } else {
                if (2 * i + 1 >= charArray.length) { // 必须要有子节点
                    return false;
                }
            }
            // 父节点一定不能是#
            if (i != 0 && Objects.equals(charArray[i / 2], "#")) return false;
        }
        return true;
    }
}
