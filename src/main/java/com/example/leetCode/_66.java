package com.example.leetCode;

import java.util.LinkedList;

/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */
// https://technooblog.com/2019/04/10/
// 全部コピー
// @lc code=start
public class _66 {
    public int[] plusOne(int[] digits) {

        boolean countUp = false;

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = digits.length - 1; i >= 0; i--) {
            int chosei = 0;
            if (i == digits.length - 1) {
                chosei++;
            }
            if (countUp) {
                chosei++;
                countUp = false;
            }
            int tmp = digits[i] + chosei;
            if (10 <= tmp) {
                countUp = true;
                tmp %= 10;
            }
            list.addLast(tmp);
            // 最後繰り上げ
            if (countUp && i == 0) {
                list.addLast(1);
            }
        }
        int[] res = new int[list.size()];
        int index = list.size() - 1;
        for (int b : list) {
            res[index] = b;
            index--;
        }
        return res;


    }
}
// @lc code=end
