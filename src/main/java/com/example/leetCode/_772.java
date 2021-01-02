package com.example.leetCode;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class _772 {
  class ListNode{
    int val;
    ListNode next;
  }

  public boolean isPalindrome(ListNode head) {
    if (Objects.isNull(head)) {
      return true;
    }

    ArrayList<Integer> list = new ArrayList<>();
    boolean loop = true;
    while (loop) {
      list.add(head.val);
      head = head.next;

      if (Objects.isNull(head)) {
        loop = false;
        break;
      }
    }
    boolean actual = true;
    for (int i = 0; i <= list.size() / 2; i++) {

      int compareA = list.get(i);
      int compareB = list.get(list.size() - 1 - i);
      if (compareA != compareB) {

        return false;
      }
    }
    return true;
  }
}
