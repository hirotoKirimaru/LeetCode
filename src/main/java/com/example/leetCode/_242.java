package com.example.leetCode;//Given two strings s and t , write a function to determine if t is an anagram o
//f s.
//
// Example 1:
//
//
//Input: s = "anagram", t = "nagaram"
//Output: true
//
//
// Example 2:
//
//
//Input: s = "rat", t = "car"
//Output: false
//
//
// Note:
//You may assume the string contains only lowercase alphabets.
//
// Follow up:
//What if the inputs contain unicode characters? How would you adapt your soluti
//on to such case?
// Related Topics Hash Table Sort
// 👍 2091 👎 156


//leetcode submit region begin(Prohibit modification and deletion)
class _242 {
  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    for (char c : t.toCharArray()) {
      int i = s.indexOf(c);
      if (i == -1) {
        return false;
      }
      s = s.replaceFirst(String.valueOf(c), "");
    }
    return s.equals("");
  }
}
//leetcode submit region end(Prohibit modification and deletion)
