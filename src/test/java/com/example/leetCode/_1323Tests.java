package com.example.leetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _1323Tests {
  _1323 target = new _1323();

  @Test
  void test_01() {
    assertThat(
        target.maximum69Number(9669)
    ).isEqualTo(9969);
  }
}
