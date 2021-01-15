package com.example.leetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _929Tests {
  _929 target = new _929();

  @Test
  void test_01() {
    int actual = target.numUniqueEmails(new String[]{"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"});

    assertThat(actual).isEqualTo(2);
  }

  @Test
  void test_02() {
    int actual = target.numUniqueEmails(new String[]{"testemail@leetcode.com","testemail1@leetcode.com","testemail+david@lee.tcode.com"});

    assertThat(actual).isEqualTo(3);
  }

}
