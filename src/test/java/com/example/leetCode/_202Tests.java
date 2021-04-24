package com.example.leetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _202Tests {
  _202 target = new _202();

  @Test
  void test_01() {
    assertThat(
        target.isHappy(19)
    ).isEqualTo(true);
  }
  @Test
  void test_02() {
    assertThat(
        target.isHappy(2)
    ).isEqualTo(false);
  }

  @Test
  void test_03() {
    assertThat(
        target.isHappy(1819140969)
    ).isEqualTo(true);
  }

  @Test
  void test_04() {
    assertThat(
        target.isHappy(1999999999)
    ).isEqualTo(false);
  }
}
