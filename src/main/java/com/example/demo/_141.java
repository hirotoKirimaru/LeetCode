package com.example.demo;
//Given head, the head of a linked list, determine if the linked list has a cycl
//e in it.
//
// There is a cycle in a linked list if there is some node in the list that can
//be reached again by continuously following the next pointer. Internally, pos is
//used to denote the index of the node that tail's next pointer is connected to. N
//ote that pos is not passed as a parameter.
//
// Return true if there is a cycle in the linked list. Otherwise, return false.
//
//
//
// Example 1:
//
//
//Input: head = [3,2,0,-4], pos = 1
//Output: true
//Explanation: There is a cycle in the linked list, where the tail connects to t
//he 1st node (0-indexed).
//
//
// Example 2:
//
//
//Input: head = [1,2], pos = 0
//Output: true
//Explanation: There is a cycle in the linked list, where the tail connects to t
//he 0th node.
//
//
// Example 3:
//
//
//Input: head = [1], pos = -1
//Output: false
//Explanation: There is no cycle in the linked list.
//
//
//
// Constraints:
//
//
// The number of the nodes in the list is in the range [0, 104].
// -105 <= Node.val <= 105
// pos is -1 or a valid index in the linked-list.
//
//
//
// Follow up: Can you solve it using O(1) (i.e. constant) memory?
// Related Topics Linked List Two Pointers
// 👍 3685 👎 563


//leetcode submit region begin(Prohibit modification and deletion)

import lombok.AllArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class _141 {
  @Setter
  public static class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      this.val = x;
      next = null;
    }
  }

  public boolean hasCycle(ListNode head) {

    var list = new ArrayList<ListNode>();

    while (head != null) {
      if (head.next == null) {
        return false;
      }

      if (list.contains(head)) {
        return true;
      }

      list.add(head);
      head = head.next;
    }

    return false;
  }
}
//leetcode submit region end(Prohibit modification and deletion)
