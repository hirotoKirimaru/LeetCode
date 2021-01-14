package com.example.leetCode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _283Tests {
  _283 target = new _283();

  @Test
  void test_01() {
    int[] nums = new int[]{1};
    int[] expect = new int[]{1};
    target.moveZeroes(nums);

    assertThat(nums).isEqualTo(expect);
  }

  @Test
  void test_02() {
    int[] nums = new int[]{0, 1, 0, 3, 12};
    int[] expect = new int[]{1, 3, 12, 0, 0};
    target.moveZeroes(nums);

    assertThat(nums).isEqualTo(expect);
  }

}
