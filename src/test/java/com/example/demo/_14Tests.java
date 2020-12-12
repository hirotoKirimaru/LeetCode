package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _14Tests {
  _14 target = new _14();

  @Test
  void test_01() {
    String[] param = {"flower", "flow", "flight"};
    assertThat(target.longestCommonPrefix(param)).isEqualTo("fl");
  }

  @Test
  void test_02() {
    String[] param = {"dog", "racecar", "car"};
    assertThat(target.longestCommonPrefix(param)).isEqualTo("");
  }

  @Test
  void test_03() {
    String[] param = {""};
    assertThat(target.longestCommonPrefix(param)).isEqualTo("");
  }

  @Test
  void test_04() {
    String[] param = {"aiueo", "aiueo"};
    assertThat(target.longestCommonPrefix(param)).isEqualTo("aiueo");
  }

  @Test
  void test_05() {
    String[] param = {};
    assertThat(target.longestCommonPrefix(param)).isEqualTo("");
  }

  @Test
  void test_06() {
    String[] param = {"ab", "a"};
    assertThat(target.longestCommonPrefix(param)).isEqualTo("a");
  }


}
