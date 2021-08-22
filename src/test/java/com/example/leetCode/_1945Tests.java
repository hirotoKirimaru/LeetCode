package com.example.leetCode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class _1945Tests {

  _1945 target = new _1945();

  @Test
  void test_01() {
    assertThat(
        target.getLucky("1", 1)
    ).isEqualTo(1);
  }
}