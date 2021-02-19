package com.example.leetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _155Tests {

  @Test
  void test_01() {
//["MinStack","push","push","push","getMin","pop","top","getMin"]
//[[],[-2],[0],[-3],[],[],[],[]]
//
//Output
//[null,null,null,null,-3,null,0,-2]
    _155 target = new _155();
    target.push(-2);
    target.push(0);
    target.push(-3);
    assertThat(target.getMin()).isEqualTo(-3);
    target.pop();
    assertThat(target.top()).isEqualTo(0);
    assertThat(target.getMin()).isEqualTo(-2);
  }

  @Test
  void test_02() {
//    input:["MinStack","push","push","push","getMin","top","pop","getMin"]
//			[[],[-2],[0],[-1],[],[],[],[]]
//    Output:[null,null,null,null,-2,0,null,-2]
//    Expected:[null,null,null,null,-2,-1,null,-2]
    _155 target = new _155();
    target.push(-2);
    target.push(0);
    target.push(-1);
    assertThat(target.getMin()).isEqualTo(-2);
    assertThat(target.top()).isEqualTo(-1);
    target.pop();
    assertThat(target.getMin()).isEqualTo(-2);
  }
}
