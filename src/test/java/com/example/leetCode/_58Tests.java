package com.example.leetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _58Tests {
  _58 target = new _58();

  @Test
  void test_01() {
    assertThat(target.lengthOfLastWord("Hello World")).isEqualTo(5);

  }

  @Test
  void test_02() {
    assertThat(target.lengthOfLastWord(" ")).isEqualTo(0);

  }
}
