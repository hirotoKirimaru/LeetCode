package com.example.leetCode;//Given a binary tree, return all root-to-leaf paths.
//
// Note: A leaf is a node with no children.
//
// Example:
//
//
//Input:
//
//   1
// /   \
//2     3
// \
//  5
//
//Output: ["1->2->5", "1->3"]
//
//Explanation: All root-to-leaf paths are: 1->2->5, 1->3
// Related Topics Tree Depth-first Search
// 👍 2256 👎 122


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

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
class _257 {

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

  public List<String> binaryTreePaths(TreeNode root) {
    List<String> result = new ArrayList<String>();
    if (root == null) return result;
    if (root.left == null && root.right == null) {
      result.add(Integer.toString(root.val));
      return result;
    }
    for (String t : binaryTreePaths(root.left)) {
      result.add(root.val + "->" + t);
    }
    for (String t : binaryTreePaths(root.right)) {
      result.add(root.val + "->" + t);
    }
    return result;
  }
}
//leetcode submit region end(Prohibit modification and deletion)
