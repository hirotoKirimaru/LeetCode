package com.example.leetCode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _5Tests {

  _5 target = new _5();

  @Test
  void test_01() {
    assertThat(
        target.longestPalindrome("babad")
    ).isEqualTo("bab");
  }
}