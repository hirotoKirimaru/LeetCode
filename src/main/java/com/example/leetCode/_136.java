package com.example.leetCode;
//Given a non-empty array of integers nums, every element appears twice except f
//or one. Find that single one.
//
// Follow up: Could you implement a solution with a linear runtime complexity an
//d without using extra memory?
//
//
// Example 1:
// Input: nums = [2,2,1]
//Output: 1
// Example 2:
// Input: nums = [4,1,2,1,2]
//Output: 4
// Example 3:
// Input: nums = [1]
//Output: 1
//
//
// Constraints:
//
//
// 1 <= nums.length <= 3 * 104
// -3 * 104 <= nums[i] <= 3 * 104
// Each element in the array appears twice except for one element which appears
//only once.
//
// Related Topics Hash Table Bit Manipulation
// 👍 5653 👎 187


import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//leetcode submit region begin(Prohibit modification and deletion)
class _136 {
  public class Result {
    int num;
    boolean bool;

    public Result(int num, boolean bool) {
      this.num = num;
      this.bool = bool;
    }
  }

  public int singleNumber(int[] nums) {
    Set<Result> rtn = new HashSet<>();
    boolean include = false;
    for (int num : nums) {
      for (Result result : rtn) {
        if (result.num == num) {
          result.bool = true;
          include = true;
          continue;
        }
      }

      if (include) {
        include = false;
        continue;
      }

      rtn.add(new Result(num, false));
    }

    for (Result result : rtn) {
      if (result.bool) {
        continue;
      }
      return result.num;
    }
    return 0;
  }
}
//leetcode submit region end(Prohibit modification and deletion)
