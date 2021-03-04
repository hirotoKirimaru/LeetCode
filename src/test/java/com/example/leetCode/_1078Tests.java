package com.example.leetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _1078Tests {
  _1078 target = new _1078();

  @Test
  void test_01() {
    String[] actual = target.findOcurrences("alice is a good girl she is a good student", "a", "good");
    assertThat(actual).isEqualTo(new String[]{"girl", "student"});
  }
}
