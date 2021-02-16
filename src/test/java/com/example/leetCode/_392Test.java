package com.example.leetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _392Test {
  _392 target = new _392();

  @Test
  void test_01() {
    assertThat(target.isSubsequence("abc", "ahbgdc")).isTrue();
  }

  @Test
  void test_02() {
    assertThat(target.isSubsequence("axc", "ahbgdc")).isFalse();
  }

  @Test
  void test_03() {
    assertThat(target.isSubsequence("aaaaaa", "bbaaaa")).isFalse();
  }
}
