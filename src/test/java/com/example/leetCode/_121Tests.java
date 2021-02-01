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

  @Test
  void test_02() {
    int actual = target.maxProfit(new int[]{7, 6, 5, 4, 3, 1});
    assertThat(actual).isEqualTo(0);
  }

  @Test
  void test_03() {
    int actual = target.maxProfit(new int[]{2, 4, 1});
    assertThat(actual).isEqualTo(2);
  }

  @Test
  void test_04() {
    int actual = target.maxProfit(new int[]{2, 1, 2, 0, 1});
    assertThat(actual).isEqualTo(1);
  }

  @Test
  void test_05() {
    int actual = target.maxProfit(new int[]{2, 1, 2, 1, 0, 1, 2});
    assertThat(actual).isEqualTo(2);
  }

  @Test
  void test_06() {
    int actual = target.maxProfit(new int[]{3, 2, 6, 5, 0, 3});
    assertThat(actual).isEqualTo(4);
  }
}
