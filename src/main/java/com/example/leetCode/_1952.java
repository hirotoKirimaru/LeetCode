package com.example.leetCode;
//Given an integer n, return true if n has exactly three positive divisors.
//Otherwise, return false.
//
// An integer m is a divisor of n if there exists an integer k such that n = k *
// m.
//
//
// Example 1:
//
//
//Input: n = 2
//Output: false
//Explantion: 2 has only two divisors: 1 and 2.
//
//
// Example 2:
//
//
//Input: n = 4
//Output: true
//Explantion: 4 has three divisors: 1, 2, and 4.
//
//
//
// Constraints:
//
//
// 1 <= n <= 10⁴
//
// Related Topics Math 👍 105 👎 9


//leetcode submit region begin(Prohibit modification and deletion)
class _1952 {

  public boolean isThree(int n) {
    int result = 0;
    for (int i = 1; i <= n; i++) {
      if (n / i * i == n) {
        result++;
        if (result == 4) {
          return false;
        }
      }
    }

    return result == 3;
  }
}
//leetcode submit region end(Prohibit modification and deletion)
