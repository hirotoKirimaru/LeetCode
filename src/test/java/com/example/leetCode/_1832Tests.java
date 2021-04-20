package com.example.leetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _1832Tests {
  _1832 target = new _1832();

  @Test
  void test_01() {
    assertThat(
        target.checkIfPangram("thequickbrownfoxjumpsoverthelazydog")
    ).isEqualTo(true);
  }
  @Test
  void test_02() {
    assertThat(
        target.checkIfPangram("leetcode")
    ).isEqualTo(false);
  }
}
