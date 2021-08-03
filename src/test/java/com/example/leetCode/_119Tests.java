package com.example.leetCode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class _119Tests {

  _119 target = new _119();

  @Test
  void test_01() {
    assertThat(
        target.getRow(3)
    ).isEqualTo(Arrays.asList(1, 3, 3, 1));
  }
}