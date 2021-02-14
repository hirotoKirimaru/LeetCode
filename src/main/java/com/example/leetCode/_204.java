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
    Set<Integer> rtn = new HashSet<>();
    if (2 < n) {
      rtn.add(2);
    }
    for (int i = 3; i < n; i++) {
      if (i % 2 == 0) {
        continue;
      }
      boolean prime = true;
      for (Integer integer : rtn) {
        if (i % integer == 0) {
          prime = false;
          break;
        }
      }
      if (prime) {
        rtn.add(i);
      }
    }
    return rtn.size();
  }

}
//leetcode submit region end(Prohibit modification and deletion)
