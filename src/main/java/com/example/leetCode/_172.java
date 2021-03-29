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
    int result = 0;
    while (n != 0) {
      result += n / 5;
      n = n / 5;
    }
    return result;
  }
}
//leetcode submit region end(Prohibit modification and deletion)
