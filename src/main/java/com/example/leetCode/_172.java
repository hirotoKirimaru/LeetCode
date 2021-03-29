package com.example.leetCode;//Given an integer n, return the number of trailing zeroes in n!.
//
// Follow up: Could you write a solution that works in logarithmic time complexi
//ty?
//
//
// Example 1:
//
//
//Input: n = 3
//Output: 0
//Explanation: 3! = 6, no trailing zero.
//
//
// Example 2:
//
//
//Input: n = 5
//Output: 1
//Explanation: 5! = 120, one trailing zero.
//
//
// Example 3:
//
//
//Input: n = 0
//Output: 0
//
//
//
// Constraints:
//
//
// 0 <= n <= 104
//
// Related Topics Math
// 👍 1229 👎 1365


//leetcode submit region begin(Prohibit modification and deletion)
class _172 {
  public int trailingZeroes(int n) {
    int tmp = 1;
    for (int i = 1; i <= n; i++) {
      tmp = tmp * i;
    }

    int rtn = 0;
    String s = String.valueOf(tmp);
    char[] chars = s.toCharArray();
    for (int i = s.length() - 1; 0 < i; i--) {
      if (chars[i] == 48) {
        rtn++;
        continue;
      } else {
        return rtn;
      }
    }
    return rtn;
  }
}
//leetcode submit region end(Prohibit modification and deletion)
