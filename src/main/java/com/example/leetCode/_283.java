package com.example.leetCode;//Given an array nums, write a function to move all 0's to the end of it while m
//aintaining the relative order of the non-zero elements.
//
// Example:
//
//
//Input: [0,1,0,3,12]
//Output: [1,3,12,0,0]
//
// Note:
//
//
// You must do this in-place without making a copy of the array.
// Minimize the total number of operations.
// Related Topics Array Two Pointers
// 👍 4835 👎 149


import java.util.Arrays;
import java.util.Comparator;

//leetcode submit region begin(Prohibit modification and deletion)
class _283 {
  public void moveZeroes(int[] nums) {

    int count = 0;
    int index = 0;
    for (int num : nums) {
      if (num == 0) {
        count++;
      } else {
        nums[index] = num;
        index++;
      }
    }

    for (int i = 1; i <= count; i++) {
      nums[nums.length - i] = 0;
    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)
