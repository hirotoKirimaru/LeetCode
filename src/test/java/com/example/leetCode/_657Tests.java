package com.example.leetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _657Tests {
  _657 target = new _657();

  @Test
  void test_01() {
    assertThat(target.judgeCircle("UD")).isEqualTo(true);
  }

  @Test
  void test_02() {
    assertThat(target.judgeCircle("LL")).isEqualTo(false);
  }

  @Test
  void test_03() {
    assertThat(target.judgeCircle("LRUD")).isEqualTo(true);
  }
}
