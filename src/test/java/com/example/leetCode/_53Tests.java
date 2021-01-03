package com.example.leetCode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _53Tests {
  _53 target = new _53();

  @Test
  void test_01() {

    int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
    int i = target.maxSubArray(nums);
    assertThat(i).isEqualTo(6);
  }


  @Test
  void test_02() {

    int[] nums = new int[]{1};
    int i = target.maxSubArray(nums);
    assertThat(i).isEqualTo(1);
  }

  @Test
  void test_03() {

    int[] nums = new int[]{0};
    int i = target.maxSubArray(nums);
    assertThat(i).isEqualTo(0);
  }

  @Test
  void test_04() {

    int[] nums = new int[]{-1};
    int i = target.maxSubArray(nums);
    assertThat(i).isEqualTo(-1);
  }


  @Test
  void test_05() {

    int[] nums = new int[]{-2147483647};
    int i = target.maxSubArray(nums);
    assertThat(i).isEqualTo(-2147483647);
  }

  @Test
  void test_06() {

    int[] nums = new int[]{-100, -50};
    int i = target.maxSubArray(nums);
    assertThat(i).isEqualTo(-50);
  }

  @Test
  void test_07() {

    int[] nums = new int[]{-100, 900, -50};
    int i = target.maxSubArray(nums);
    assertThat(i).isEqualTo(900);
  }

//  @DisplayName("わからない")
  @Test
  void test_08() {

    int[] nums = new int[]{8, -19, 5, -4, 20};
    int i = target.maxSubArray(nums);
    assertThat(i).isEqualTo(21);
  }

}
