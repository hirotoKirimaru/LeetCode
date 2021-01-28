package com.example.leetCode;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _703Tests {

  @Disabled("やり方が不明。")
  @Test
  void test_01() {
    KthLargest kthLargest = new KthLargest(3, new int[]{4, 5, 8, 2});
    kthLargest.add(3);   // return 4
    kthLargest.add(5);   // return 5
    kthLargest.add(10);  // return 5
    kthLargest.add(9);   // return 8
    kthLargest.add(4);   // return 8
  }
}
