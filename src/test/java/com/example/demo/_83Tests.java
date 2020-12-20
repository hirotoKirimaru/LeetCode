package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _83Tests {
  _83 target = new _83();

  @Test
  void test_01(){
    _83.ListNode node1 = new _83.ListNode(1);
    _83.ListNode node2 = new _83.ListNode(1);
    _83.ListNode node3 = new _83.ListNode(2);

    node1.next = node2;
    node2.next = node3;

    _83.ListNode actual = target.deleteDuplicates(node1);
    assertThat(actual.val).isEqualTo(1);
    assertThat(actual.next.val).isEqualTo(2);
  }

  @Test
  void test_02(){
    _83.ListNode node1 = new _83.ListNode(1);
    _83.ListNode node2 = new _83.ListNode(1);
    _83.ListNode node3 = new _83.ListNode(2);
    _83.ListNode node4 = new _83.ListNode(3);
    _83.ListNode node5 = new _83.ListNode(3);

    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = node5;

    _83.ListNode actual = target.deleteDuplicates(node1);
    assertThat(actual.val).isEqualTo(1);
    assertThat(actual.next.val).isEqualTo(2);
    assertThat(actual.next.next.val).isEqualTo(3);
  }
}
