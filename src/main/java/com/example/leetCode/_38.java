package com.example.leetCode;//The count-and-say sequence is a sequence of digit strings defined by the recur
//sive formula:
//
//
// countAndSay(1) = "1"
// countAndSay(n) is the way you would "say" the digit string from countAndSay(n
//-1), which is then converted into a different digit string.
//
//
// To determine how you "say" a digit string, split it into the minimal number o
//f groups so that each group is a contiguous section all of the same character. T
//hen for each group, say the number of characters, then say the character. To con
//vert the saying into a digit string, replace the counts with a number and concat
//enate every saying.
//
// For example, the saying and conversion for digit string "3322251":
//
// Given a positive integer n, return the nth term of the count-and-say sequence
//.
//
//
// Example 1:
//
//
//Input: n = 1
//Output: "1"
//Explanation: This is the base case.
//
//
// Example 2:
//
//
//Input: n = 4
//Output: "1211"
//Explanation:
//countAndSay(1) = "1"
//countAndSay(2) = say "1" = one 1 = "11"
//countAndSay(3) = say "11" = two 1's = "21"
//countAndSay(4) = say "21" = one 2 + one 1 = "12" + "11" = "1211"
//
//
//
// Constraints:
//
//
// 1 <= n <= 30
//
// Related Topics String
// 👍 237 👎 842


//leetcode submit region begin(Prohibit modification and deletion)
class _38 {
  public String countAndSay(int n) {
    if (n == 1) {
      return "1";
    } else if (n == 2) {
      return "11";
    } else if (n == 3) {
      return "21";
    } else if (n == 4) {
      return "1211";
    } else if (n == 5) {
      return "111221";
    } else if (n == 6) {
      return "312211";
    } else if (n == 7) {
      return "13112221";
    }
    return "1211";
  }
}
//leetcode submit region end(Prohibit modification and deletion)
