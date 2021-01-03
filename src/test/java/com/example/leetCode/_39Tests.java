package com.example.leetCode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _39Tests {
  _39 target = new _39();

  @Test
  void test_01() {
    var expected = List.of(List.of(2, 3, 7), List.of(7));
    var actual = target.combinationSum(new int[]{2, 3, 6, 7}, 7);

    assertThat(actual).isEqualTo(expected);
  }

  @Test
  void test_02() {
    var expected = List.of(List.of(2, 2, 2, 2), List.of(2, 3, 3), List.of(3, 5));
    var actual = target.combinationSum(new int[]{2, 3, 5}, 8);

    assertThat(actual).isEqualTo(expected);
  }

  @Test
  void test_03() {
    var expected = List.of();
    var actual = target.combinationSum(new int[]{2}, 1);

    assertThat(actual).isEqualTo(expected);
  }

  @Test
  void test_04() {
    var expected = List.of(List.of(1));
    var actual = target.combinationSum(new int[]{1}, 1);

    assertThat(actual).isEqualTo(expected);
  }

  @Test
  void test_05() {
    var expected = List.of(List.of(1,1));
    var actual = target.combinationSum(new int[]{1}, 2);

    assertThat(actual).isEqualTo(expected);
  }

}
