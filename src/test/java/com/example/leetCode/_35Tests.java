package com.example.leetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _35Tests {
  _35 target = new _35();

  @Test
  void test_01() {
    int actual = target.searchInsert(new int[]{1, 3, 5, 6}, 5);
    assertThat(actual).isEqualTo(2);
  }

  @Test
  void test_02() {
    int actual = target.searchInsert(new int[]{1, 3, 5, 6}, 2);
    assertThat(actual).isEqualTo(1);
  }

  @Test
  void test_03() {
    int actual = target.searchInsert(new int[]{1, 3, 5, 6}, 7);
    assertThat(actual).isEqualTo(4);
  }

  @Test
  void test_04() {
    int actual = target.searchInsert(new int[]{1, 3, 5, 6}, 0);
    assertThat(actual).isEqualTo(0);
  }

  @Test
  void test_05() {
    int actual = target.searchInsert(new int[]{1}, 0);
    assertThat(actual).isEqualTo(0);
  }

}
