package com.example.leetCode;//Write a program to check whether a given number is an ugly number.
//
// Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
//
// Example 1:
//
//
//Input: 6
//Output: true
//Explanation: 6 = 2 × 3
//
// Example 2:
//
//
//Input: 8
//Output: true
//Explanation: 8 = 2 × 2 × 2
//
//
// Example 3:
//
//
//Input: 14
//Output: false
//Explanation: 14 is not ugly since it includes another prime factor 7.
//
//
// Note:
//
//
// 1 is typically treated as an ugly number.
// Input is within the 32-bit signed integer range: [−231, 231 − 1].
// Related Topics Math
// 👍 646 👎 728


import java.math.BigDecimal;
import java.math.MathContext;

//leetcode submit region begin(Prohibit modification and deletion)
class _263 {
  public enum Numbers {
    _2(BigDecimal.valueOf(2)),
    _3(BigDecimal.valueOf(3)),
    _5(BigDecimal.valueOf(5));
    BigDecimal num;

    Numbers(BigDecimal i) {
      this.num = i;
    }

    public static BigDecimal divide(BigDecimal num) {
      BigDecimal tmp = num;
      for (Numbers value : values()) {
        BigDecimal divide = tmp.divide(value.num, MathContext.DECIMAL128);
        String s = divide.subtract(new BigDecimal(divide.intValue())).toPlainString();
        if (s.equals("0")) {
          return divide;
        }
      }

      return BigDecimal.valueOf(-1);
    }

  }

  public boolean isUgly(int num) {
    if (num == 0){
      return false;
    }
    if (num == 1){
      return true;
    }

    BigDecimal tmp = BigDecimal.valueOf(num);
    while (true) {
      BigDecimal divide = Numbers.divide(tmp);
      if (divide.equals(BigDecimal.ONE)) {
        return true;
      }
      if (divide.equals(BigDecimal.valueOf(-1))) {
        return false;
      }
      tmp = divide;
    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)
