package com.example.leetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _21Tests {
  _21 target = new _21();


  @Test
  void test_01(){
    _21.ListNode param1 = new _21.ListNode(1, new _21.ListNode(2, new _21.ListNode(4)));
    _21.ListNode param2 = new _21.ListNode(1, new _21.ListNode(3, new _21.ListNode(4)));
    _21.ListNode actual = target.mergeTwoLists(param1, param2);

    _21.ListNode expect = new _21.ListNode(1, new _21.ListNode(1, new _21.ListNode(2, new _21.ListNode(3, new _21.ListNode(4, new _21.ListNode(4))))));
    assertThat(actual).isEqualTo(expect);
  }

  @Test
  void test_02(){
    _21.ListNode param1 = null;
    _21.ListNode param2 = null;
    _21.ListNode actual = target.mergeTwoLists(param1, param2);

    _21.ListNode expect = null;
    assertThat(actual).isEqualTo(expect);

  }

  @Test
  void test_03(){
    _21.ListNode param1 = null;
    _21.ListNode param2 = new _21.ListNode(0);
    _21.ListNode actual = target.mergeTwoLists(param1, param2);

    _21.ListNode expect = new _21.ListNode(0);
    assertThat(actual).isEqualTo(expect);

  }
}
