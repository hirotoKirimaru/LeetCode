package com.example.leetCode;

/**
 * @lc app=leetcode id=7 lang=java
 *
 *     [7] Reverse Integer
 */
// @lc code=start
public class _7 {
    public int reverse(int x) {
        String str = String.valueOf(x);

        String rtn = "";
        if (x < 0){
            str = str.substring(1, str.length());
            rtn = "-";
        }

        for (int i=str.length();i > 0; i--){
            rtn += str.substring(i - 1, i);
        }
        try {
            return Integer.parseInt(rtn);
        } catch(Exception e){
            return 0;
        }

    }
}
// @lc code=end

