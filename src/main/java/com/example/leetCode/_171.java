package com.example.leetCode;//Given a string columnTitle that represents the column title as appear in an Ex
//cel sheet, return its corresponding column number.
//
// For example:
//
//
//A -> 1
//B -> 2
//C -> 3
//...
//Z -> 26
//AA -> 27
//AB -> 28
//...
//
//
//
// Example 1:
//
//
//Input: columnTitle = "A"
//Output: 1
//
//
// Example 2:
//
//
//Input: columnTitle = "AB"
//Output: 28
//
//
// Example 3:
//
//
//Input: columnTitle = "ZY"
//Output: 701
//
//
// Example 4:
//
//
//Input: columnTitle = "FXSHRXW"
//Output: 2147483647
//
//
//
// Constraints:
//
//
// 1 <= columnTitle.length <= 7
// columnTitle consists only of uppercase English letters.
// columnTitle is in the range ["A", "FXSHRXW"].
//
// Related Topics Math
// 👍 1602 👎 194


//leetcode submit region begin(Prohibit modification and deletion)
class _171 {
  public int titleToNumber(String columnTitle) {
    int rtn = 0;
    int length = columnTitle.length();
    for (char c : columnTitle.toCharArray()) {
      length--;
      if (length == 0) {
        rtn += c - 64;
      } else {
        rtn += (c - 64) * length * 26;
      }
    }
    return rtn;
  }
}
//leetcode submit region end(Prohibit modification and deletion)
