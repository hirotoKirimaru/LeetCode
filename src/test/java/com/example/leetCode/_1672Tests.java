package com.example.leetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _1672Tests {
  _1672 target = new _1672();

  @Test
  void test_01() {
    assertThat(
        target.maximumWealth(new int[][]{{1, 2, 3}, {3, 2, 1}})
    ).isEqualTo(6);
  }

  @Test
  void test_02() {
    assertThat(
        target.maximumWealth(new int[][]{{1, 5}, {7, 3}, {3, 5}})
    ).isEqualTo(10);
  }
}
