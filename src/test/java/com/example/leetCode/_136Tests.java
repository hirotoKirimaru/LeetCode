package com.example.leetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _136Tests {
  _136 target = new _136();

  @Test
  void test_01() {
    assertThat(target.singleNumber(new int[]{2, 2, 1})).isEqualTo(1);
  }

  @Test
  void test_02() {
    assertThat(target.singleNumber(new int[]{4, 1, 2, 1, 2})).isEqualTo(4);
  }


  @Test
  void test_03() {
    assertThat(target.singleNumber(new int[]{1})).isEqualTo(1);
  }

  @Test
  void test_04() {
    assertThat(target.singleNumber(new int[]{-1, -1, -2})).isEqualTo(-2);
  }
}
