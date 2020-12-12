package com.example.demo;//Merge two sorted linked lists and return it as a new sorted list. The new list
// should be made by splicing together the nodes of the first two lists.
//
//
// Example 1:
//
//
//Input: l1 = [1,2,4], l2 = [1,3,4]
//Output: [1,1,2,3,4,4]
//
//
// Example 2:
//
//
//Input: l1 = [], l2 = []
//Output: []
//
//
// Example 3:
//
//
//Input: l1 = [], l2 = [0]
//Output: [0]
//
//
//
// Constraints:
//
//
// The number of nodes in both lists is in the range [0, 50].
// -100 <= Node.val <= 100
// Both l1 and l2 are sorted in non-decreasing order.
//
// Related Topics Linked List
// 👍 5510 👎 682


//leetcode submit region begin(Prohibit modification and deletion)

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
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
class _21 {
  @ToString
  @EqualsAndHashCode
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

  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ArrayList<Integer> lists = new ArrayList<>();
    ListNode tmp = l1;
    while (tmp != null) {
      lists.add(tmp.val);
      tmp = tmp.next;
    }

    tmp = l2;
    while (tmp != null) {
      lists.add(tmp.val);
      tmp = tmp.next;
    }

    ListNode next = null;
    List<Integer> collect = lists.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

    for (Integer num : collect) {
      if (next == null){
        next = new ListNode(num);
      } else {
        next = new ListNode(num, next);
      }
    }

    return next;
  }
}
//leetcode submit region end(Prohibit modification and deletion)
