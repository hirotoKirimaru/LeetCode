package com.example.leetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _844Tests {
  _844 target = new _844();

  @Test
  void test_01() {
    assertThat(
        target.backspaceCompare("ab#c", "ad#c")
    ).isEqualTo(true);
  }
  @Test
  void test_02() {
    assertThat(
        target.backspaceCompare("a#c", "b")
    ).isEqualTo(false);
  }
}
