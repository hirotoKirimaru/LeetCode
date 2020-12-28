package com.example.demo;//You are given two non-empty linked lists representing two non-negative integer
//s. The digits are stored in reverse order, and each of their nodes contains a si
//ngle digit. Add the two numbers and return the sum as a linked list.
//
// You may assume the two numbers do not contain any leading zero, except the nu
//mber 0 itself.
//
//
// Example 1:
//
//
//Input: l1 = [2,4,3], l2 = [5,6,4]
//Output: [7,0,8]
//Explanation: 342 + 465 = 807.
//
//
// Example 2:
//
//
//Input: l1 = [0], l2 = [0]
//Output: [0]
//
//
// Example 3:
//
//
//Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//Output: [8,9,9,9,0,0,0,1]
//
//
//
// Constraints:
//
//
// The number of nodes in each linked list is in the range [1, 100].
// 0 <= Node.val <= 9
// It is guaranteed that the list represents a number that does not have leading
// zeros.
//
// Related Topics Linked List Math
// 👍 10101 👎 2534


//leetcode submit region begin(Prohibit modification and deletion)

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
class _2 {
  @Setter
  @NoArgsConstructor
  @AllArgsConstructor
  public static class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
      this.val = val;
    }
  }


  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    StringBuilder l1Number = new StringBuilder();
    while (l1 != null) {
      l1Number.insert(0, l1.val);
      l1 = l1.next;
    }

    StringBuilder l2Number = new StringBuilder();
    while (l2 != null) {
      l2Number.insert(0, l2.val);
      l2 = l2.next;
    }

    var sum = Integer.parseInt(l1Number.toString()) + Integer.parseInt(l2Number.toString());

    String sumStr = String.valueOf(sum);

    ListNode rtn = null;
    while (!sumStr.equals("")) {
      rtn = new ListNode(Integer.parseInt(sumStr.substring(0, 1)), rtn);
      sumStr = sumStr.substring(1);
    }


    return rtn;
  }


}
//leetcode submit region end(Prohibit modification and deletion)
