package com.example.leetCode;
//Write an algorithm to determine if a number n is happy.
//
// A happy number is a number defined by the following process:
//
//
// Starting with any positive integer, replace the number by the sum of the squa
//res of its digits.
// Repeat the process until the number equals 1 (where it will stay), or it loop
//s endlessly in a cycle which does not include 1.
// Those numbers for which this process ends in 1 are happy.
//
//
// Return true if n is a happy number, and false if not.
//
//
// Example 1:
//
//
//Input: n = 19
//Output: true
//Explanation:
//12 + 92 = 82
//82 + 22 = 68
//62 + 82 = 100
//12 + 02 + 02 = 1
//
//
// Example 2:
//
//
//Input: n = 2
//Output: false
//
//
//
// Constraints:
//
//
// 1 <= n <= 231 - 1
//
// Related Topics Hash Table Math
// 👍 3099 👎 510


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class _202 {
  public boolean isHappy(int n) {
    List<Double> doubleList = new ArrayList<>();
    return getSum(n, doubleList);
  }

  private boolean getSum(int n, List<Double> doubleList) {
    if (n == 1) {
      return true;
    }

    double sum = 0;

    int i = 1;
    int beforeSum = 0;

    while (true) {
      int hoge = n % (10 * i);
      int tmp = hoge - beforeSum;

      sum += Math.pow(tmp / i, 2);
      if (hoge == n) {
        break;
      }
      beforeSum += tmp;
      i *= 10;
    }
    // こういう書き方もあり。
//    sum = String.valueOf(n).chars().map(a -> (a - 0x30)).map(a -> a * a).sum();

    if (doubleList.contains(sum)) {
      return false;
    }
    doubleList.add(sum);

    return getSum((int) sum, doubleList);
  }
}
//leetcode submit region end(Prohibit modification and deletion)
