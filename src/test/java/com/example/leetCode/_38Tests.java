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
    assertThat(target.countAndSay(2)).isEqualTo("11");
  }

  @Test
  void test_03() {
    assertThat(target.countAndSay(3)).isEqualTo("21");
  }

  @Test
  void test_04() {
    assertThat(target.countAndSay(4)).isEqualTo("1211");
  }

  @Test
  void test_05() {
    assertThat(target.countAndSay(5)).isEqualTo("111221");
  }
  @Test
  void test_06() {
    assertThat(target.countAndSay(6)).isEqualTo("312211");
  }
  @Test
  void test_07() {
    assertThat(target.countAndSay(7)).isEqualTo("13112221");
  }
  @Test
  void test_08() {
    assertThat(target.countAndSay(8)).isEqualTo("1113213211");
  }
  @Test
  void test_09() {
    assertThat(target.countAndSay(9)).isEqualTo("31131211131221");
  }
  @Test
  void test_10() {
    assertThat(target.countAndSay(10)).isEqualTo("13211311123113112211");
  }

}
