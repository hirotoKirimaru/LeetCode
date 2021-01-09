package com.example.leetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _242Tests {
  _242 target = new _242();

  @Test
  void test_01() {
    assertThat(target.isAnagram("anagram", "nagaram")).isEqualTo(true);
  }

  @Test
  void test_02() {
    assertThat(target.isAnagram("rat", "car")).isEqualTo(false);
  }

  @Test
  void test_03() {
    assertThat(target.isAnagram("a", "ab")).isEqualTo(false);
  }

  @Test
  void test_04() {
    assertThat(target.isAnagram("aacc", "ccac")).isEqualTo(false);
  }
}
