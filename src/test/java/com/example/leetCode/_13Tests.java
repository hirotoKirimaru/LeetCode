package com.example.leetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _13Tests {
  _13 target = new _13();

  @Test
  void test_01(){
    int actual = target.romanToInt("III");
    assertThat(actual).isEqualTo(3);
  }

}
