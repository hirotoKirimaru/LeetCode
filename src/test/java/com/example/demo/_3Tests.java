package com.example.demo;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

class _3Tests {
  _3 target = new _3();

  @Test
  void test_01() {
    int actual = target.lengthOfLongestSubstring("abcabcbb");
    assertThat(actual).isEqualTo(3);
  }

  @Test
  void test_02() {
    int actual = target.lengthOfLongestSubstring("bbbbb");
    assertThat(actual).isEqualTo(1);
  }

  @Test
  void test_03() {
    int actual = target.lengthOfLongestSubstring("pwwkew");
    assertThat(actual).isEqualTo(3);
  }

  @Test
  void test_04() {
    int actual = target.lengthOfLongestSubstring("");
    assertThat(actual).isEqualTo(0);
  }
}
