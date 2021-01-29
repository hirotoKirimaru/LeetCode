package com.example.leetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _349Tests {
  _349 target = new _349();

  @Test
  void test_01() {
    int[] param1 = new int[]{1, 2, 2, 1};
    int[] param2 = new int[]{2, 2};

    int[] actual = target.intersection(param1, param2);

    assertThat(actual).contains(2);
  }

  @Test
  void test_02() {
    int[] param1 = new int[]{4, 9, 5};
    int[] param2 = new int[]{9, 4, 9, 8, 4};

    int[] actual = target.intersection(param1, param2);

    assertThat(actual).contains(9).contains(4);
  }
}
