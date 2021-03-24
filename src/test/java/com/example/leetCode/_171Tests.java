package com.example.leetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _171Tests {
  _171 target = new _171();

  @Test
  void test_01() {
    assertThat(
        target.titleToNumber("A")
    ).isEqualTo(1);
  }
}
