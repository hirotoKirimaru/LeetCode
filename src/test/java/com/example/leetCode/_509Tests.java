package com.example.leetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _509Tests {
  _509 target = new _509();

  @Test
  void test_01() {
    assertThat(
        target.fib(2)
    ).isEqualTo(1);
  }

  @Test
  void test_02() {
    assertThat(
        target.fib(3)
    ).isEqualTo(2);
  }

  @Test
  void test_03() {
    assertThat(
        target.fib(4)
    ).isEqualTo(3);
  }
}
