package com.example.leetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _387Tests {
  _387 target = new _387();

  @Test
  void test_01() {
    assertThat(target.firstUniqChar("leetcode")).isEqualTo(0);
  }
  @Test
  void test_02() {
    assertThat(target.firstUniqChar("loveleetcode")).isEqualTo(2);
  }
  @Test
  void test_03() {
    assertThat(target.firstUniqChar(null)).isEqualTo(-1);
  }
}
