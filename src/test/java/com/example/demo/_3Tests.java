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

  @Test
  void test_05() {
    int actual = target.lengthOfLongestSubstring("c");
    assertThat(actual).isEqualTo(1);
  }

  @Test
  void test_06() {
    int actual = target.lengthOfLongestSubstring("au");
    assertThat(actual).isEqualTo(2);
  }

  @Test
  void test_07() {
    int actual = target.lengthOfLongestSubstring("aab");
    assertThat(actual).isEqualTo(2);
  }

  @Test
  void test_08() {
    int actual = target.lengthOfLongestSubstring("dvdf");
    assertThat(actual).isEqualTo(3);
  }
}
