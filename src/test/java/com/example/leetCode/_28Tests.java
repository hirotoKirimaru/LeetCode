package com.example.leetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _28Tests {
  _28 target = new _28();

  @Test
  void test_01() {
    assertThat(
        target.strStr("hello", "ll")
    ).isEqualTo(2);
  }

  @Test
  void test_02() {
    assertThat(
        target.strStr("aaaaaa", "bba")
    ).isEqualTo(-1);
  }

  @Test
  void test_03() {
    assertThat(
        target.strStr("", "")
    ).isEqualTo(0);
  }
}
