package com.example.leetCode;
//The string "PAYPALISHIRING" is written in a zigzag pattern on a given number o
//f rows like this: (you may want to display this pattern in a fixed font for bett
//er legibility)
//
//
//P   A   H   N
//A P L S I I G
//Y   I   R
//
//
// And then read line by line: "PAHNAPLSIIGYIR"
//
// Write the code that will take a string and make this conversion given a numbe
//r of rows:
//
//
//string convert(string s, int numRows);
//
//
//
// Example 1:
//
//
//Input: s = "PAYPALISHIRING", numRows = 3
//Output: "PAHNAPLSIIGYIR"
//
//
// Example 2:
//
//
//Input: s = "PAYPALISHIRING", numRows = 4
//Output: "PINALSIGYAHRPI"
//Explanation:
//P     I    N
//A   L S  I G
//Y A   H R
//P     I
//
//
// Example 3:
//
//
//Input: s = "A", numRows = 1
//Output: "A"
//
//
//
// Constraints:
//
//
// 1 <= s.length <= 1000
// s consists of English letters (lower-case and upper-case), ',' and '.'.
// 1 <= numRows <= 1000
//
// Related Topics String
// 👍 2164 👎 5463


//leetcode submit region begin(Prohibit modification and deletion)
class _6 {
  public String convert(String s, int numRows) {
    if (numRows == 1) {
      return s;
    }


//    1
//    3(2*numRows-3) 1と最終列目
//        5

    // 3=1
    // 4= 1, 3, 1,3

    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= numRows; i++) {
      if (i == 1 || i == numRows) {
        for (int i2 = i; i2 <= s.length(); i2++) {

          int i1 = 0;
          if (i2 == i) {
            i1 = i - 1;
          } else {
            i1 = (2 * numRows - 2) * (i2 - 1);
          }

          if (i1 >= s.length()) {
            break;
          }
          sb.append(s.substring(i1, i1 + 1));
        }
      }
      // test_01_01を動かすためのbreak
      break;

    }

    return sb.toString();
  }
}
//leetcode submit region end(Prohibit modification and deletion)
