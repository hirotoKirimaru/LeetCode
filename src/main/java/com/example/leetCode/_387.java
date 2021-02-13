package com.example.leetCode;//Given a string, find the first non-repeating character in it and return its in
//dex. If it doesn't exist, return -1.
//
// Examples:
//
//
//s = "leetcode"
//return 0.
//
//s = "loveleetcode"
//return 2.
//
//
//
//
// Note: You may assume the string contains only lowercase English letters.
// Related Topics Hash Table String
// 👍 2637 👎 132


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//leetcode submit region begin(Prohibit modification and deletion)
class _387 {
  public int firstUniqChar(String s) {
    if (s == null || "".equals(s)) {
      return -1;
    }
    int rtn = 0;
    List<String> test = new ArrayList<>();
    for (char c : s.toCharArray()) {

      var i = s.lastIndexOf(c);
      if (rtn == i && !test.contains(String.valueOf(c))) {
        return rtn;
      }
      test.add(String.valueOf(c));

      rtn++;
    }
    return -1;
  }
}
//leetcode submit region end(Prohibit modification and deletion)
