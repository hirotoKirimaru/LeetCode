package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _141Tests {
  _141 target = new _141();

  @Test
  void test_01(){
    _141.ListNode param = new _141.ListNode(3);
    _141.ListNode param2 = new _141.ListNode(2);
    _141.ListNode param3 = new _141.ListNode(0);
    _141.ListNode param4 = new _141.ListNode(-4);

    param.next = param2;
    param2.next = param3;
    param3.next = param4;
    param4.next = param2;

    assertThat(target.hasCycle(param)).isEqualTo(true);
  }


  @Test
  void test_03(){
    _141.ListNode param = new _141.ListNode(1);

    assertThat(target.hasCycle(param)).isEqualTo(false);
  }

  @Test
  void test_04(){
    _141.ListNode param = new _141.ListNode(1);
    _141.ListNode param2 = new _141.ListNode(2);

    param.next = param2;

    assertThat(target.hasCycle(param)).isEqualTo(false);
  }

}
