package com.example.leetCode;//Given a binary tree, find its minimum depth.
//
// The minimum depth is the number of nodes along the shortest path from the roo
//t node down to the nearest leaf node.
//
// Note: A leaf is a node with no children.
//
//
// Example 1:
//
//
//Input: root = [3,9,20,null,null,15,7]
//Output: 2
//
//
// Example 2:
//
//
//Input: root = [2,null,3,null,4,null,5,null,6]
//Output: 5
//
//
//
// Constraints:
//
//
// The number of nodes in the tree is in the range [0, 105].
// -1000 <= Node.val <= 1000
//
// Related Topics Tree Depth-first Search Breadth-first Search
// 👍 2024 👎 787


//leetcode submit region begin(Prohibit modification and deletion)

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class _111 {
  @NoArgsConstructor
  @AllArgsConstructor
  public static class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int val) { this.val = val; }
 }
  public int minDepth(TreeNode root) {
    return 0;
  }
}
//leetcode submit region end(Prohibit modification and deletion)
