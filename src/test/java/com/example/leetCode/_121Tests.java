package com.example.leetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _121Tests {
  _121 target = new _121();

  @Test
  void test_01() {
    int actual = target.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
    assertThat(actual).isEqualTo(5);
  }

}
