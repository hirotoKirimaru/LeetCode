package com.example.leetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _504Tests {
  _504 target = new _504();

  @Test
  void test_01() {
    assertThat(target.convertToBase7(100))
        .isEqualTo("202");
  }

  @Test
  void test_02() {
    assertThat(target.convertToBase7(-7))
        .isEqualTo("-10");
  }

  @Test
  void test_03() {
    assertThat(target.convertToBase7(0))
        .isEqualTo("0");
  }

  @Test
  void test_04() {
    assertThat(target.convertToBase7(1))
        .isEqualTo("1");
  }

  @Test
  void test_05() {
    assertThat(target.convertToBase7(-1))
        .isEqualTo("-1");
  }
}
