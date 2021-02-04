package com.example.leetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _168Tests {
  _168 target = new _168();

  @Test
  void test_01() {
    assertThat(target.convertToTitle(1)).isEqualTo("A");
  }

  @Test
  void test_02() {
    assertThat(target.convertToTitle(28)).isEqualTo("AB");
  }
  @Test
  void test_03() {
    assertThat(target.convertToTitle(701)).isEqualTo("ZY");
  }


}
