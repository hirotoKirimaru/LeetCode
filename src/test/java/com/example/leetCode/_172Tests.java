package com.example.leetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _172Tests {
  _172 target = new _172();

  @Test
  void test_01() {
    assertThat(
        target.trailingZeroes(3)
    ).isEqualTo(0);
  }

  @Test
  void test_02() {
    assertThat(
        target.trailingZeroes(5)
    ).isEqualTo(1);
  }

  @Test
  void test_03() {
    assertThat(
        target.trailingZeroes(0)
    ).isEqualTo(0);
  }

  @Test
  void test_04() {
    assertThat(
        target.trailingZeroes(7)
    ).isEqualTo(1);
  }

  @Test
  void test_05() {
    assertThat(
        target.trailingZeroes(13)
    ).isEqualTo(2);
  }

}
