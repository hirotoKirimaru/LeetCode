package com.example.leetCode;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _190Tests {
  _190 target = new _190();

  @Test
  void test_01() {
    assertThat(target.reverseBits(43261596)).isEqualTo(964176192);
  }

  @Disabled("わからん")
  @Test
  void test_02() {
//    Your input:00000010100101000001111010011100
    // 43261596
//    Output:    15065253 (00000000111001011110000010100101)
//    Expected:   964176192 (00111001011110000010100101000000)
    assertThat(target.reverseBits(43261596)).isEqualTo(964176192);
  }
}
