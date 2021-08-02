package com.example.leetCode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class _118Tests {

  _118 target = new _118();


  @Test
  void test_01() {

    assertThat(
        target.generate(0)
    ).isEqualTo(Arrays.asList());
  }
}