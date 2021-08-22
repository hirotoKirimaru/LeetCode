package com.example.leetCode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class _1945Tests {

  _1945 target = new _1945();

  @Test
  void test_01() {
    assertThat(
        target.getLucky("a", 1)
    ).isEqualTo(1);
  }

  @Test
  void test_02() {
    assertThat(
        target.getLucky("b", 1)
    ).isEqualTo(2);
  }

  @Test
  void test_03() {
    assertThat(
        target.getLucky("iiii", 1)
    ).isEqualTo(36);
  }


}