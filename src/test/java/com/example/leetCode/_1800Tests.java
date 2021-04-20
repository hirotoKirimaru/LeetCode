package com.example.leetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _1800Tests {
  _1800 target = new _1800();

  @Test
  void test_01() {
    assertThat(
        target.maxAscendingSum(new int[]{10, 20, 30, 5, 10, 50})
    ).isEqualTo(65);
  }
}
