package com.example.leetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _26Tests {
  _26 target = new _26();

  @Test
  void test_01() {
    int[] param1 = new int[]{1, 1, 2};
    int i = target.removeDuplicates(param1);
    int[] expectedArray = new int[]{1, 2};

    assertThat(i).isEqualTo(2);
    assertThat(param1).isEqualTo(expectedArray);
  }

  @Test
  void test_02() {
    int[] param1 = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    int i = target.removeDuplicates(param1);

    assertThat(i).isEqualTo(5);
  }

}
