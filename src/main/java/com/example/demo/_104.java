package com.example.demo;//Given the root of a binary tree, return its maximum depth.
//
// A binary tree's maximum depth is the number of nodes along the longest path f
//rom the root node down to the farthest leaf node.
//
//
// Example 1:
//
//
//Input: root = [3,9,20,null,null,15,7]
//Output: 3
//
//
// Example 2:
//
//
//Input: root = [1,null,2]
//Output: 2
//
//
// Example 3:
//
//
//Input: root = []
//Output: 0
//
//
// Example 4:
//
//
//Input: root = [0]
//Output: 1
//
//
//
// Constraints:
//
//
// The number of nodes in the tree is in the range [0, 104].
// -100 <= Node.val <= 100
// Related Topics Tree Depth-first Search Recursion
// 👍 3367 👎 87


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class _104 {
  public static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }

  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }

    int depth = 0;
    int rightDepth = 0;
    TreeNode tmp = root;
    TreeNode left;
    TreeNode right;
    while (true) {
      left = tmp.left;
      right = tmp.right;

      if (right != null) {
        tmp = right;
        depth++;
        continue;
      }

      if (left != null) {
        tmp = left;
        depth++;
        continue;
      }

      if (left == null & right == null) {
        break;
      }
    }
    tmp = root.left;

    int leftDepth = 1;
    while (true) {
      if (tmp == null) {
        leftDepth = 0;
        break;
      }

      left = tmp.left;
      right = tmp.right;

      if (left != null) {
        tmp = left;
        leftDepth++;
        continue;
      }

      if (right != null) {
        tmp = right;
        leftDepth++;
        continue;
      }

      if (left == null & right == null) {
        break;
      }
    }

    return Math.max(depth, leftDepth) + 1;
  }


}
//leetcode submit region end(Prohibit modification and deletion)
