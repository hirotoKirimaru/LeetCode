package com.example.leetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _414Tests {
  _414 target = new _414();

  @Test
  void test_01() {
    assertThat(target.thirdMax(new int[]{3, 2, 1})).isEqualTo(1);
  }
}
