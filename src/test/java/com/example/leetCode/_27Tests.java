package com.example.leetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _27Tests {
  _27 target = new _27();

  @Test
  void test_01(){
    int[] param1 = new int[]{ 3,2,2,3};
    int i = target.removeElement(param1, 3);

    assertThat(i).isEqualTo(2);
    assertThat(param1[0]).isEqualTo(2);
    assertThat(param1[1]).isEqualTo(2);
  }

  @Test
  void test_02(){
    int[] param1 = new int[]{ 0,1,2,2,3,0,4,2};
    int i = target.removeElement(param1, 2);

    assertThat(i).isEqualTo(5);
    assertThat(param1)
        .contains(0)
        .contains(1)
        .contains(3)
        .contains(0)
        .contains(4)
    ;
  }

}
