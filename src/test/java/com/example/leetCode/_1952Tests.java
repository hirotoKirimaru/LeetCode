package com.example.leetCode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _1952Tests {
  _1952 target = new _1952();

  @Test
  void test_01() {
    assertThat(
        target.isThree(2)
    ).isFalse();
  }

  @Test
  void test_02() {
    assertThat(
        target.isThree(4)
    ).isTrue();
  }
}