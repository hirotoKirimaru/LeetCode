package com.example.leetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _204Tests {
  _204 target = new _204();

  @Test
  void test_01() {
    assertThat(target.countPrimes(10)).isEqualTo(4);
  }
  @Test
  void test_02() {
    assertThat(target.countPrimes(0)).isEqualTo(0);
  }
  @Test
  void test_03() {
    assertThat(target.countPrimes(1)).isEqualTo(0);
  }
}
