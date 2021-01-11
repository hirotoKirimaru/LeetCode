package com.example.leetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _263Tests {
  _263 target = new _263();

  @Test
  void test_01() {
    assertThat(target.isUgly(6)).isEqualTo(true);
  }

  @Test
  void test_02() {
    assertThat(target.isUgly(8)).isEqualTo(true);
  }

  @Test
  void test_03() {
    assertThat(target.isUgly(14)).isEqualTo(false);
  }

  @Test
  void test_04() {
    assertThat(target.isUgly(0)).isEqualTo(false);
  }

  @Test
  void test_05() {
    assertThat(target.isUgly(1)).isEqualTo(true);
  }

  @Test
  void test_06() {
    assertThat(target.isUgly(2147483647)).isEqualTo(false);
  }
}
