package com.example.leetCode;//Given a string s consists of some words separated by spaces, return the length
// of the last word in the string. If the last word does not exist, return 0.
//
// A word is a maximal substring consisting of non-space characters only.
//
//
// Example 1:
// Input: s = "Hello World"
//Output: 5
// Example 2:
// Input: s = " "
//Output: 0
//
//
// Constraints:
//
//
// 1 <= s.length <= 104
// s consists of only English letters and spaces ' '.
//
// Related Topics String
// 👍 946 👎 2969


//leetcode submit region begin(Prohibit modification and deletion)
class _58 {
  public int lengthOfLastWord(String s) {
    String[] s1 = s.split(" ");
    if (s1.length == 0) {
      return 0;
    }
    String s2 = s1[s1.length - 1];
    return s2.length();
  }
}
//leetcode submit region end(Prohibit modification and deletion)
