package com.example.leetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _125Tests {
  _125 target = new _125();

  @Test
  void test_01() {
    String param = "A man, a plan, a canal: Panama";

    assertThat(target.isPalindrome(param)).isTrue();
  }


  @Test
  void test_02() {
    String param = "race a car";

    assertThat(target.isPalindrome(param)).isFalse();
  }

  @Test
  void test_03() {
    String param = "a.";

    assertThat(target.isPalindrome(param)).isTrue();
  }
}
