package com.example.leetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _485Tests {
  _485 target = new _485();

  @Test
  void test_01() {
    assertThat(
        target.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1})
    ).isEqualTo(3);
  }

  @Test
  void test_02() {
    assertThat(
        target.findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1})
    ).isEqualTo(2);
  }

}
