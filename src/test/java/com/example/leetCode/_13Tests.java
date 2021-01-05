package com.example.leetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _13Tests {
  _13 target = new _13();

  @Test
  void test_01() {
    int actual = target.romanToInt("III");
    assertThat(actual).isEqualTo(3);
  }

  @Test
  void test_02() {
    int actual = target.romanToInt("IV");
    assertThat(actual).isEqualTo(4);
  }

  @Test
  void test_03() {
    int actual = target.romanToInt("IX");
    assertThat(actual).isEqualTo(9);
  }

  @Test
  void test_04() {
    int actual = target.romanToInt("LVIII");
    assertThat(actual).isEqualTo(58);
  }

  @Test
  void test_05() {
    int actual = target.romanToInt("MCMXCIV");
    assertThat(actual).isEqualTo(1994);
  }
}
