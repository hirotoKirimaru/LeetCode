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

  @Test
  void test_02() {
    assertThat(
        target.titleToNumber("AB")
    ).isEqualTo(28);
  }

  @Test
  void test_03() {
    assertThat(
        target.titleToNumber("ZY")
    ).isEqualTo(701);
  }

  @Test
  void test_04() {
    assertThat(
        target.titleToNumber("FXSHRXW")
    ).isEqualTo(2147483647);

  }

}
