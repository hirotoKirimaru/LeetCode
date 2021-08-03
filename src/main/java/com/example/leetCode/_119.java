package com.example.leetCode;
//Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal
//'s triangle.
//
// In Pascal's triangle, each number is the sum of the two numbers directly abov
//e it as shown:
//
//
// Example 1:
// Input: rowIndex = 3
//Output: [1,3,3,1]
// Example 2:
// Input: rowIndex = 0
//Output: [1]
// Example 3:
// Input: rowIndex = 1
//Output: [1,1]
//
//
// Constraints:
//
//
// 0 <= rowIndex <= 33
//
//
//
// Follow up: Could you optimize your algorithm to use only O(rowIndex) extra sp
//ace?
// Related Topics Array Dynamic Programming
// 👍 1605 👎 231


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class _119 {

  public List<Integer> getRow(int rowIndex) {
    var rtn = new ArrayList<List<Integer>>();

    var tmp = new ArrayList<Integer>();
    for (int i = 1; i <= rowIndex + 1; i++) {
      tmp = new ArrayList<Integer>();
      if (rtn.isEmpty()) {
        tmp.add(1);
      } else if (rtn.size() == 1) {
        tmp.add(1);
        tmp.add(1);
      } else {
        List<Integer> integers = rtn.get(i - 2);
        for (int i1 = 0; i1 < integers.size(); i1++) {
          if (i1 == 0) {
            tmp.add(1);
          } else {
            Integer integer1 = integers.get(i1 - 1);
            Integer integer2 = integers.get(i1);
            tmp.add(integer1 + integer2);
          }
        }
        tmp.add(1);
      }

      rtn.add(tmp);
    }

    return tmp;
  }
}
//leetcode submit region end(Prohibit modification and deletion)
