package com.example.demo;

//Write a function to find the longest common prefix string amongst an array of
//strings.
//
// If there is no common prefix, return an empty string "".
//
//
// Example 1:
//
//
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
//
//
// Example 2:
//
//
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.
//
//
//
// Constraints:
//
//
// 0 <= strs.length <= 200
// 0 <= strs[i].length <= 200
// strs[i] consists of only lower-case English letters.
//
// Related Topics String
// 👍 3371 👎 2044


import java.util.Collection;

//leetcode submit region begin(Prohibit modification and deletion)
class _14 {
  public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) {
      return "";
    }
    String rtn = "";
    String tmp = "";


    String crieteria = strs[0];
    for (int i = 0; i < crieteria.length(); i++) {
      if (crieteria.equals("")) {
        return "";
      }
      tmp = crieteria.substring(0, i + 1);
      for (String str2 : strs) {
        if (str2.length() < i + 1) {
          return rtn;
        }

        String substring = str2.substring(0, i + 1);
        if (tmp.equals(substring)) {
          continue;
        } else {
          return rtn;
        }
      }
      rtn = tmp;
    }

    return rtn;
  }
}
//leetcode submit region end(Prohibit modification and deletion)
