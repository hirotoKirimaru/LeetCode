package com.example.leetCode;//Count the number of prime numbers less than a non-negative number, n.
//
//
// Example 1:
//
//
//Input: n = 10
//Output: 4
//Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
//
//
// Example 2:
//
//
//Input: n = 0
//Output: 0
//
//
// Example 3:
//
//
//Input: n = 1
//Output: 0
//
//
//
// Constraints:
//
//
// 0 <= n <= 5 * 106
//
// Related Topics Hash Table Math
// 👍 2722 👎 723


import java.util.HashSet;
import java.util.Set;

//leetcode submit region begin(Prohibit modification and deletion)
class _204 {
  public int countPrimes(int n) {
    boolean notPrime[] = new boolean[n];
    int count = 0;
    for (int i = 2; i < n; i++) {
      if (!notPrime[i]) {
        count++;
        for (int j = 2; i * j < n; j++) {
          notPrime[i * j] = true;
        }
      }
    }
    return count;
  }

}
//leetcode submit region end(Prohibit modification and deletion)
