package com.example.leetCode;//Given an integer array nums, find the contiguous subarray (containing at least
// one number) which has the largest sum and return its sum.
//
// Follow up: If you have figured out the O(n) solution, try coding another solu
//tion using the divide and conquer approach, which is more subtle.
//
//
// Example 1:
//
//
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: [4,-1,2,1] has the largest sum = 6.
//
//
// Example 2:
//
//
//Input: nums = [1]
//Output: 1
//
//
// Example 3:
//
//
//Input: nums = [0]
//Output: 0
//
//
// Example 4:
//
//
//Input: nums = [-1]
//Output: -1
//
//
// Example 5:
//
//
//Input: nums = [-2147483647]
//Output: -2147483647
//
//
//
// Constraints:
//
//
// 1 <= nums.length <= 2 * 104
// -231 <= nums[i] <= 231 - 1
//
// Related Topics Array Divide and Conquer Dynamic Programming
// 👍 10151 👎 491


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//leetcode submit region begin(Prohibit modification and deletion)
class _53 {
  public int maxSubArray(int[] nums) {
    List<Integer> rtn = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {
      int num = nums[i];
      if (rtn.size() == 0) {
        rtn.add(num);
        continue;
      }

      // 最初の数値はマイナスになるのであれば、できるだけ大きい値にする。
      // -100, 900, -50のうち
      // -100, 900の組み合わせと、900, -50の組み合わせをぶつける
//      if (num < 0) {
      int sum = rtn.stream().flatMapToInt(IntStream::of).sum();
      List<Integer> integers = new ArrayList<>(rtn);
      integers.remove(0);
      integers.add(num);
      int exceptFirst = integers.stream().flatMapToInt(IntStream::of).sum();
      if (sum < exceptFirst) {
        rtn.clear();
        rtn.addAll(integers);
        continue;
      }
//        continue;
//      }
      rtn.add(num);


    }
    return rtn.stream().flatMapToInt(IntStream::of).sum();
  }
}
//leetcode submit region end(Prohibit modification and deletion)
