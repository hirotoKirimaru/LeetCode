package com.example.leetCode;//Given two strings s and t, check if s is a subsequence of t.
//
// A subsequence of a string is a new string that is formed from the original st
//ring by deleting some (can be none) of the characters without disturbing the rel
//ative positions of the remaining characters. (i.e., "ace" is a subsequence of "a
//bcde" while "aec" is not).
//
//
// Example 1:
// Input: s = "abc", t = "ahbgdc"
//Output: true
// Example 2:
// Input: s = "axc", t = "ahbgdc"
//Output: false
//
//
// Constraints:
//
//
// 0 <= s.length <= 100
// 0 <= t.length <= 104
// s and t consist only of lowercase English letters.
//
//
//
//Follow up: If there are lots of incoming s, say s1, s2, ..., sk where k >= 109
//, and you want to check one by one to see if t has its subsequence. In this scen
//ario, how would you change your code? Related Topics Binary Search Dynamic Progr
//amming Greedy
// 👍 2201 👎 230


//leetcode submit region begin(Prohibit modification and deletion)
class _392 {
  public boolean isSubsequence(String s, String t) {
    for (char c : s.toCharArray()) {
      int i = t.indexOf(String.valueOf(c));
      if (i == -1) {
        return false;
      }
      t = t.substring(i + 1);
    }

    return true;
  }
}
//leetcode submit region end(Prohibit modification and deletion)
