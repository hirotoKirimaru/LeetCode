package com.example.leetCode;//Given a string, determine if it is a palindrome, considering only alphanumeric
// characters and ignoring cases.
//
// Note: For the purpose of this problem, we define empty string as valid palind
//rome.
//
// Example 1:
//
//
//Input: "A man, a plan, a canal: Panama"
//Output: true
//
//
// Example 2:
//
//
//Input: "race a car"
//Output: false
//
//
//
// Constraints:
//
//
// s consists only of printable ASCII characters.
//
// Related Topics Two Pointers String
// 👍 1724 👎 3523


//leetcode submit region begin(Prohibit modification and deletion)
class _125 {
  public boolean isPalindrome(String s) {
    s = s.replaceAll("[^A-Za-z0-9]", "");

    for (int i = 0; i < s.length(); i++) {
      String start = s.substring(i, i + 1);
      String end = s.substring(s.length() - i - 1, s.length() - i);
      if (start.equalsIgnoreCase(end)) {
        continue;
      }
      return false;
    }

    return true;
  }
}
//leetcode submit region end(Prohibit modification and deletion)
