package com.example.leetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _88Tests {
  _88 target = new _88();

  @Test
  void test_01() {
    int[] param1 = new int[]{1, 2, 3, 0, 0, 0};
    target.merge(param1, 3, new int[]{2, 5, 6}, 3);

    assertThat(param1).isEqualTo(new int[]{1, 2, 2, 3, 5, 6});
  }
}
