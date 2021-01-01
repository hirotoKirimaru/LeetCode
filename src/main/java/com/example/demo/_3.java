package com.example.demo;//Given a string s, find the length of the longest substring without repeating c
//haracters.
//
//
// Example 1:
//
//
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
//
//
// Example 2:
//
//
//Input: s = "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
//
//
// Example 3:
//
//
//Input: s = "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//Notice that the answer must be a substring, "pwke" is a subsequence and not a
//substring.
//
//
// Example 4:
//
//
//Input: s = ""
//Output: 0
//
//
//
// Constraints:
//
//
// 0 <= s.length <= 5 * 104
// s consists of English letters, digits, symbols and spaces.
//
// Related Topics Hash Table Two Pointers String Sliding Window
// 👍 12244 👎 653


//leetcode submit region begin(Prohibit modification and deletion)
class _3 {
  public int lengthOfLongestSubstring(String s) {
    if ("".equals(s)) {
      return 0;
    }
    String tmp = "";

    int returnNum = 0;
    int startIndex = 0;
    for (int i = 1; i <= s.length(); i++) {
      tmp = s.substring(startIndex, i);
      String substring = s.substring(i);

      boolean contains = substring.contains(tmp);
      if (contains) {
        if (tmp.equals(substring.substring(0, i - startIndex))) {
          returnNum = tmp.length();
          startIndex = i;
        }
      } else {
        System.out.println("");
      }
    }


    return returnNum;
  }
}
//leetcode submit region end(Prohibit modification and deletion)
