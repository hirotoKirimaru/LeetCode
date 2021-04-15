package com.example.leetCode;
//The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibon
//acci sequence, such that each number is the sum of the two preceding ones, start
//ing from 0 and 1. That is,
//
//
//F(0) = 0, F(1) = 1
//F(n) = F(n - 1) + F(n - 2), for n > 1.
//
//
// Given n, calculate F(n).
//
//
// Example 1:
//
//
//Input: n = 2
//Output: 1
//Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
//
//
// Example 2:
//
//
//Input: n = 3
//Output: 2
//Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
//
//
// Example 3:
//
//
//Input: n = 4
//Output: 3
//Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
//
//
//
// Constraints:
//
//
// 0 <= n <= 30
//
// Related Topics Array
// 👍 1190 👎 223


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class _509 {
  public int fib(int n) {
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }

    List<Integer> list = new ArrayList<>();
    list.add(0);
    list.add(1);

    for (int i = 2; i <= n; i++) {
      list.add(list.get(i - 2) + list.get(i - 1));
    }
    return list.get(list.size() - 1);
  }
}
//leetcode submit region end(Prohibit modification and deletion)
