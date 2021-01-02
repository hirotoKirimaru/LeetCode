package com.example.leetCode;

/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
public class _9 {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);

        for (int i=0; i< str.length() / 2;i++){
            String first = str.substring(i,i+1);
            String last = str.substring(str.length() -1 -i, str.length()-i);

            if (!first.equals(last)){
                return false;
            };
        }
        return true;
    }
}
// @lc code=end

