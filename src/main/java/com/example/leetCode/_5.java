package com.example.leetCode;
//Given a string s, return the longest palindromic substring in s.
//
//
// Example 1:
//
//
//Input: s = "babad"
//Output: "bab"
//Note: "aba" is also a valid answer.
//
//
// Example 2:
//
//
//Input: s = "cbbd"
//Output: "bb"
//
//
// Example 3:
//
//
//Input: s = "a"
//Output: "a"
//
//
// Example 4:
//
//
//Input: s = "ac"
//Output: "a"
//
//
//
// Constraints:
//
//
// 1 <= s.length <= 1000
// s consist of only digits and English letters.
//
// Related Topics String Dynamic Programming 👍 13106 👎 788


//leetcode submit region begin(Prohibit modification and deletion)
class _5 {

  // コピペ
  //https://leetcode.com/problems/longest-palindromic-substring/discuss/410963/Python-beats-93-solution-with-illustrations
  public String longestPalindrome(String s) {
    if (s.length() < 2) {
      return s;
    }
    int start = 0;
    int maxLen = 1;
    int i = 0;

    while (i < s.length()) {
      int l = i;
      int r = i;

      while ((r < s.length() - 1) && (s.charAt(r) == s.charAt(r + 1))) {
        r += 1;
      }
      i = r + 1;
      while ((r < s.length() - 1) && l > 0 && s.charAt(r + 1) == s.charAt(l - 1)) {
        l -= 1;
        r += 1;
      }
      if ((maxLen < r - l + 1)) {
        start = l;
        maxLen = r - l + 1;
      }
    }
    return s.substring(start, start + maxLen);
  }
}
//leetcode submit region end(Prohibit modification and deletion)
