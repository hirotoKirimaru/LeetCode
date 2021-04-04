package com.example.leetCode;
//Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one
// sorted array.
//
// The number of elements initialized in nums1 and nums2 are m and n respectivel
//y. You may assume that nums1 has a size equal to m + n such that it has enough s
//pace to hold additional elements from nums2.
//
//
// Example 1:
// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//Output: [1,2,2,3,5,6]
// Example 2:
// Input: nums1 = [1], m = 1, nums2 = [], n = 0
//Output: [1]
//
//
// Constraints:
//
//
// nums1.length == m + n
// nums2.length == n
// 0 <= m, n <= 200
// 1 <= m + n <= 200
// -109 <= nums1[i], nums2[i] <= 109
//
// Related Topics Array Two Pointers
// 👍 3591 👎 5169


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//leetcode submit region begin(Prohibit modification and deletion)
class _88 {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    List<Integer> arrayList = new ArrayList<>();
    for (int i = 0; i < m; i++) {
      arrayList.add(nums1[i]);
    }

    for (int i = 0; i < n; i++) {
      arrayList.add(nums2[i]);
    }
    List<Integer> collect = arrayList.stream().sorted().collect(Collectors.toList());

    for (int i = 0; i < nums1.length; i++) {
      nums1[i] = collect.get(i);
    }

  }
}
//leetcode submit region end(Prohibit modification and deletion)
