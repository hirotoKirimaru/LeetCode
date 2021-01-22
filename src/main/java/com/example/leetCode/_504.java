package com.example.leetCode;//Given an integer, return its base 7 string representation.
//
// Example 1:
//
//Input: 100
//Output: "202"
//
//
//
// Example 2:
//
//Input: -7
//Output: "-10"
//
//
//
// Note:
//The input will be in range of [-1e7, 1e7].
// 👍 273 👎 157


//leetcode submit region begin(Prohibit modification and deletion)
class _504 {
  public String convertToBase7(int num) {
    if (num == 0) {
      return "0";
    }
    StringBuilder sb = new StringBuilder();
    int keta = 0;
    if (num >= 0) {
      while (true) {
        if (Math.pow(7, keta) > num) {
          if (keta != 0) {
            keta--;
          }
          break;
        }
        keta++;
      }

      while (true) {
        double pow = Math.pow(7, keta);
        int v = (int) (num / pow);
        sb.append(v);

        if (keta == 0) {
          break;
        }
        num -= pow * v;
        keta--;
      }
    } else {
      sb.append("-");
      while (true) {
        if (-Math.pow(7, keta) < num) {
          if (keta != 0) {
            keta--;
          }
          break;
        }
        keta++;
      }

      while (true) {
        double pow = -Math.pow(7, keta);
        int v = (int) (num / pow);
        sb.append(v);

        if (keta == 0) {
          break;
        }
        num -= pow * v;
        keta--;
      }
    }

    return sb.toString();
  }
}
//leetcode submit region end(Prohibit modification and deletion)
