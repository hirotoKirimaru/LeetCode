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
}
