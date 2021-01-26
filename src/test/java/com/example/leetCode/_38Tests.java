package com.example.leetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _38Tests {
  _38 target = new _38();

  @Test
  void test_01() {
    assertThat(target.countAndSay(1)).isEqualTo("1");
  }

  @Test
  void test_02() {
    assertThat(target.countAndSay(4)).isEqualTo("1211");
  }
}
