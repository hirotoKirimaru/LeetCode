package com.example.leetCode;//Given integer array nums, return the third maximum number in this array. If th
//e third maximum does not exist, return the maximum number.
//
//
// Example 1:
//
//
//Input: nums = [3,2,1]
//Output: 1
//Explanation: The third maximum is 1.
//
//
// Example 2:
//
//
//Input: nums = [1,2]
//Output: 2
//Explanation: The third maximum does not exist, so the maximum (2) is returned
//instead.
//
//
// Example 3:
//
//
//Input: nums = [2,2,3,1]
//Output: 1
//Explanation: Note that the third maximum here means the third maximum distinct
// number.
//Both numbers with value 2 are both considered as second maximum.
//
//
//
// Constraints:
//
//
// 1 <= nums.length <= 104
// -231 <= nums[i] <= 231 - 1
//
//
//
//Follow up: Can you find an O(n) solution? Related Topics Array
// 👍 909 👎 1613


import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//leetcode submit region begin(Prohibit modification and deletion)
class _414 {
  public int thirdMax(int[] nums) {
    int[] ints = Arrays.stream(nums)
        .distinct()
        .sorted()
        .toArray();
    if (ints.length > 2) {
      return ints[ints.length - 3];
    } else {
      return ints[ints.length - 1];
    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)
