package com.example.leetCode;//Given a positive integer, return its corresponding column title as appear in a
//n Excel sheet.
//
// For example:
//
//
//    1 -> A
//    2 -> B
//    3 -> C
//    ...
//    26 -> Z
//    27 -> AA
//    28 -> AB
//    ...
//
//
// Example 1:
//
//
//Input: 1
//Output: "A"
//
//
// Example 2:
//
//
//Input: 28
//Output: "AB"
//
//
// Example 3:
//
//
//Input: 701
//Output: "ZY"
// Related Topics Math
// 👍 1546 👎 283


//leetcode submit region begin(Prohibit modification and deletion)
class _168 {
  public String convertToTitle(int n) {

    StringBuilder sb = new StringBuilder();
    while (true) {
      if (n <= 26) {
        sb.append((char) (n + 64));
        break;
      }

      int tmp = (n - 1) / 26;
      sb.append(convertToTitle(tmp));
      n = n - (tmp * 26);
    }

    return sb.toString();
  }
}
//leetcode submit region end(Prohibit modification and deletion)
