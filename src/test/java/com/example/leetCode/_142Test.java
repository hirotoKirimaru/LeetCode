package com.example.leetCode;

import com.example.leetCode._142.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _142Test {
  _142 target = new _142();

  @Test
  void test_01() {
    ListNode node1 = new ListNode(3);
    ListNode node2 = new ListNode(2);
    ListNode node3 = new ListNode(0);
    ListNode node4 = new ListNode(-4);

    node1.setNext(node2);
    node2.setNext(node3);
    node3.setNext(node4);
    node4.setNext(node2);

    ListNode listNode = target.detectCycle(node1);
    assertThat(listNode).isEqualTo(node2);
  }

  @Test
  void test_02() {
    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(2);

    node1.setNext(node2);
    node2.setNext(node1);

    ListNode listNode = target.detectCycle(node1);
    assertThat(listNode).isEqualTo(node1);
  }

  @Test
  void test_03() {
    ListNode node1 = new ListNode(1);

    ListNode listNode = target.detectCycle(node1);
    assertThat(listNode).isEqualTo(null);
  }

  @Test
  void test_04() {
    ListNode listNode = target.detectCycle(null);
    assertThat(listNode).isEqualTo(null);
  }

  @Test
  void test_05() {
    ListNode node1 = new ListNode(-1);
    ListNode node2 = new ListNode(-7);
    ListNode node3 = new ListNode(7);
    ListNode node4 = new ListNode(-4);
    ListNode node5 = new ListNode(19);
    ListNode node6 = new ListNode(6);
    ListNode node7 = new ListNode(-9);
    ListNode node8 = new ListNode(-5);
    ListNode node9 = new ListNode(-2);
    ListNode node10 = new ListNode(-5);


    node1.setNext(node2);
    node2.setNext(node3);
    node3.setNext(node4);
    node4.setNext(node5);
    node5.setNext(node6);
    node6.setNext(node7);
    node7.setNext(node8);
    node8.setNext(node9);
    node9.setNext(node10);
    node10.setNext(node8);


    ListNode listNode = target.detectCycle(node1);
    assertThat(listNode).isEqualTo(node8);
  }

}
