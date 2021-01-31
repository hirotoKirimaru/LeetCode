package com.example.leetCode;//Given the root of a binary tree and an integer targetSum, return true if the t
//ree has a root-to-leaf path such that adding up all the values along the path eq
//uals targetSum.
//
// A leaf is a node with no children.
//
//
// Example 1:
//
//
//Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
//Output: true
//
//
// Example 2:
//
//
//Input: root = [1,2,3], targetSum = 5
//Output: false
//
//
// Example 3:
//
//
//Input: root = [1,2], targetSum = 0
//Output: false
//
//
//
// Constraints:
//
//
// The number of nodes in the tree is in the range [0, 5000].
// -1000 <= Node.val <= 1000
// -1000 <= targetSum <= 1000
//
// Related Topics Tree Depth-first Search
// 👍 2742 👎 573


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.LinkedList;

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
class _112 {
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

  public boolean hasPathSum(TreeNode root, int targetSum) {
    if (root == null) {
      return false;
    }
    if (root.val == targetSum && (root.left == null && root.right == null)) {
      return true;
    }

    return hasPathSum(root.left, targetSum - root.val)
        || hasPathSum(root.right, targetSum - root.val);
  }

  /**
   * 何も分からない。
   * https://www.programcreek.com/2013/01/leetcode-path-sum/
   *
   * @param root
   * @param sum
   * @return
   */
  public boolean hasPathSum2(TreeNode root, int sum) {
    if (root == null) return false;

    LinkedList<TreeNode> nodes = new LinkedList<TreeNode>();
    LinkedList<Integer> values = new LinkedList<Integer>();

    nodes.add(root);
    values.add(root.val);

    while (!nodes.isEmpty()) {
      TreeNode curr = nodes.poll();
      int sumValue = values.poll();

      if (curr.left == null && curr.right == null && sumValue == sum) {
        return true;
      }

      if (curr.left != null) {
        nodes.add(curr.left);
        values.add(sumValue + curr.left.val);
      }

      if (curr.right != null) {
        nodes.add(curr.right);
        values.add(sumValue + curr.right.val);
      }
    }

    return false;
  }
}
//leetcode submit region end(Prohibit modification and deletion)
