package com.example.leetCode;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _6Tests {
  _6 target = new _6();

  @org.junit.jupiter.api.Test
  void test_01() {
    assertThat(target.convert("PAYPALISHIRING", 3))
        .isEqualTo("PAHNAPLSIIGYIR");
  }

  @Disabled
  @Test
  void test_01_01() {
    assertThat(target.convert("PAYPALISHIRING", 3))
        .isEqualTo("PAHNYIR");
  }

  @Disabled
  @Test
  void test_01_02() {
    assertThat(target.convert("PAYPALISHIRING", 3))
        .isEqualTo("APLSIIG");
  }



  @Test
  void test_02() {
    assertThat(target.convert("PAYPALISHIRING",4)).isEqualTo("PINALSIGYAHRPI");
  }

  @Disabled
  @Test
  void test_02_01() {
    assertThat(target.convert("PAYPALISHIRING",4)).isEqualTo("ALSIGYAHR");
  }

  @Test
  void test_03() {
    assertThat(target.convert("A",1)).isEqualTo("A");
  }
}
