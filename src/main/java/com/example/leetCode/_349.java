package com.example.leetCode;//Given two arrays, write a function to compute their intersection.
//
// Example 1:
//
//
//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2]
//
//
//
// Example 2:
//
//
//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//Output: [9,4]
//
//
// Note:
//
//
// Each element in the result must be unique.
// The result can be in any order.
//
//
//
// Related Topics Hash Table Two Pointers Binary Search Sort
// 👍 1210 👎 1439


import java.util.*;
import java.util.stream.Collectors;

//leetcode submit region begin(Prohibit modification and deletion)
class _349 {
  public int[] intersection(int[] nums1, int[] nums2) {
    List<Integer> rtn = new ArrayList<>();
    for (int i : nums1) {
      for (int i1 : nums2) {
        if (!rtn.contains(i) && i == i1) {
          rtn.add(i1);
        }
      }
    }

    int[] rtn2 = new int[rtn.size()];
    for (int i = 0; i < rtn.size(); i++) {
      rtn2[i] = rtn.get(i);
    }

    return rtn2;
  }
}
//leetcode submit region end(Prohibit modification and deletion)
