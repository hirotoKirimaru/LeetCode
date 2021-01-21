package com.example.leetCode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _412Tests {
  _412 target = new _412();

  @Test
  void test_01(){
    assertThat(target.fizzBuzz(1)).isEqualTo(
     List.of("1")
    );
  }

}
