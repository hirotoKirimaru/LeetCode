package com.example.leetCode;//Given words first and second, consider occurrences in some text of the form "f
//irst second third", where second comes immediately after first, and third comes
//immediately after second.
//
// For each such occurrence, add "third" to the answer, and return the answer.
//
//
//
// Example 1:
//
//
//Input: text = "alice is a good girl she is a good student", first = "a", secon
//d = "good"
//Output: ["girl","student"]
//
//
//
// Example 2:
//
//
//Input: text = "we will we will rock you", first = "we", second = "will"
//Output: ["we","rock"]
//
//
//
//
// Note:
//
//
// 1 <= text.length <= 1000
// text consists of space separated words, where each word consists of lowercase
// English letters.
// 1 <= first.length, second.length <= 10
// first and second consist of lowercase English letters.
//
//
// Related Topics Hash Table
// 👍 204 👎 223


import java.util.ArrayList;
import java.util.stream.Collectors;

//leetcode submit region begin(Prohibit modification and deletion)
class _1078 {
  public String[] findOcurrences(String text, String first, String second) {
    ArrayList<String> arrayList = new ArrayList<String>();
    String[] s1 = text.split(" ");
    for (int i = 0; i < s1.length -2; i++) {
      if (first.equals(s1[i])) {
        if (second.equals(s1[i + 1])) {
          arrayList.add(s1[i + 2]);
        }
      }
    }

    return arrayList.toArray(String[]::new);
  }
}
//leetcode submit region end(Prohibit modification and deletion)
