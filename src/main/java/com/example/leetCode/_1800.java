package com.example.leetCode;
//Given an array of positive integers nums, return the maximum possible sum of a
//n ascending subarray in nums.
//
// A subarray is defined as a contiguous sequence of numbers in an array.
//
// A subarray [numsl, numsl+1, ..., numsr-1, numsr] is ascending if for all i wh
//ere l <= i < r, numsi < numsi+1. Note that a subarray of size 1 is ascending.
//
//
// Example 1:
//
//
//Input: nums = [10,20,30,5,10,50]
//Output: 65
//Explanation: [5,10,50] is the ascending subarray with the maximum sum of 65.
//
//
// Example 2:
//
//
//Input: nums = [10,20,30,40,50]
//Output: 150
//Explanation: [10,20,30,40,50] is the ascending subarray with the maximum sum o
//f 150.
//
//
// Example 3:
//
//
//Input: nums = [12,17,15,13,10,11,12]
//Output: 33
//Explanation: [10,11,12] is the ascending subarray with the maximum sum of 33.
//
//
// Example 4:
//
//
//Input: nums = [100,10,1]
//Output: 100
//
//
//
// Constraints:
//
//
// 1 <= nums.length <= 100
// 1 <= nums[i] <= 100
//
// Related Topics Two Pointers
// 👍 125 👎 4


//leetcode submit region begin(Prohibit modification and deletion)
class _1800 {
  public int maxAscendingSum(int[] nums) {
    int ans = nums[0];

    int cur = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > nums[i-1]) {
        cur += nums[i];
      } else {
        cur = nums[i];
      }
      ans = Math.max(ans, cur);
    }

    return ans;
  }
}
//leetcode submit region end(Prohibit modification and deletion)
