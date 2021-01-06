package com.example.leetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _1710Tests {
  _1710 target = new _1710();

  @Test
  void test_01() {
    int[][] param1 = new int[][]{{1, 3}, {2, 2}, {3, 1}};
    int actual = target.maximumUnits(param1, 4);
    assertThat(actual).isEqualTo(8);
  }

  @Test
  void test_02() {
    int[][] param1 = new int[][]{{5, 10}, {2, 5}, {4, 7}, {3, 9}};
    int actual = target.maximumUnits(param1, 10);
    assertThat(actual).isEqualTo(91);
  }
}
