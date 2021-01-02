package com.example.leetCode;//Given a sorted linked list, delete all duplicates such that each element appea
//r only once.
//
// Example 1:
//
//
//Input: 1->1->2
//Output: 1->2
//
//
// Example 2:
//
//
//Input: 1->1->2->3->3
//Output: 1->2->3
//
// Related Topics Linked List
// 👍 2057 👎 136


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.*;
import java.util.stream.Collectors;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class _83 {
  public static class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  public ListNode deleteDuplicates(ListNode head) {
    Set<Integer> list = new HashSet<>();

    while (head != null) {
      list.add(head.val);
      head = head.next;
    }

    ListNode rtn = null;

    List<Integer> collect = list.stream()
        .sorted(Comparator.reverseOrder()).collect(Collectors.toList());

    for (Integer integer : collect) {
      if (rtn == null) {
        rtn = new ListNode(integer);
        continue;
      }

      rtn = new ListNode(integer, rtn);
    }

    return rtn;
  }
}
//leetcode submit region end(Prohibit modification and deletion)
