package com.example.leetCode;//Given a linked list, return the node where the cycle begins. If there is no cy
//cle, return null.
//
// There is a cycle in a linked list if there is some node in the list that can
//be reached again by continuously following the next pointer. Internally, pos is
//used to denote the index of the node that tail's next pointer is connected to. N
//ote that pos is not passed as a parameter.
//
// Notice that you should not modify the linked list.
//
//
// Example 1:
//
//
//Input: head = [3,2,0,-4], pos = 1
//Output: tail connects to node index 1
//Explanation: There is a cycle in the linked list, where tail connects to the s
//econd node.
//
//
// Example 2:
//
//
//Input: head = [1,2], pos = 0
//Output: tail connects to node index 0
//Explanation: There is a cycle in the linked list, where tail connects to the f
//irst node.
//
//
// Example 3:
//
//
//Input: head = [1], pos = -1
//Output: no cycle
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
// 👍 3522 👎 268


//leetcode submit region begin(Prohibit modification and deletion)

import lombok.AllArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

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
public class _142 {
  @Setter
  @AllArgsConstructor
  public static class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      this.val = x;
      next = null;
    }
  }

  public ListNode detectCycle(ListNode head) {
    if (head == null){
      return null;
    }

    Set<ListNode> hashSet = new HashSet<>();

    while (true) {
      if (hashSet.contains(head)){
        return head;
      }
      hashSet.add(head);
      head = head.next;
      if (head == null){
        return null;
      }
    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)
