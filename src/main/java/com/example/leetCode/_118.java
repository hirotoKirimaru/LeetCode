package com.example.leetCode;
//Given an integer numRows, return the first numRows of Pascal's triangle.
//
// In Pascal's triangle, each number is the sum of the two numbers directly abov
//e it as shown:
//
//
// Example 1:
// Input: numRows = 5
//Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
// Example 2:
// Input: numRows = 1
//Output: [[1]]
//
//
// Constraints:
//
//
// 1 <= numRows <= 30
//
// Related Topics Array Dynamic Programming
// 👍 3157 👎 149


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class _118 {

  public List<List<Integer>> generate(int numRows) {
    var rtn = new ArrayList<List<Integer>>();

    for (int i = 1; i <= numRows; i++) {
      var tmp = new ArrayList<Integer>();
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

    return rtn;
  }
}
//leetcode submit region end(Prohibit modification and deletion)
