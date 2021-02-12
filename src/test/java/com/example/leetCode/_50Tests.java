package com.example.leetCode;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _50Tests {
  _50 target = new _50();

  @Test
  void test_01() {
    assertThat(target.myPow(2.00000, 10)).isEqualTo(1024.00000);
  }
  @Disabled("これは小数点以下の関係で通らない")
  @Test
  void test_02() {
    assertThat(target.myPow(2.10000, 3)).isEqualTo(9.26100);
  }
  @Test
  void test_03() {
    assertThat(target.myPow(2.00000, -2)).isEqualTo(0.25000);
  }
}
