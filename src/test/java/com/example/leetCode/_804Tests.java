package com.example.leetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _804Tests {
  _804 target = new _804();

  @Test
  void test_01() {
    assertThat(
        target.uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"})
    ).isEqualTo(2);
  }
}
