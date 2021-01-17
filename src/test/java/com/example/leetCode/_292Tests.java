package com.example.leetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _292Tests {
  _292 target = new _292();

  @Test
  void test_01(){
    assertThat(target.canWinNim(4)).isEqualTo(false);
  }

  @Test
  void test_02(){
    assertThat(target.canWinNim(1)).isEqualTo(true);
  }

  @Test
  void test_03(){
    assertThat(target.canWinNim(2)).isEqualTo(true);
  }

  @Test
  void test_04(){
    assertThat(target.canWinNim(5)).isEqualTo(true);
  }
}
