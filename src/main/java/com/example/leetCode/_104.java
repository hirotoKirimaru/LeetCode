package com.example.leetCode;//Given the root of a binary tree, return its maximum depth.
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

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
  @NoArgsConstructor
  @AllArgsConstructor
  public static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
      this.val = val;
    }
  }

  public static class Depth {
    int depth;
    List<TreeNode> nodes;

    public Depth(int i, List<TreeNode> root) {
      this.depth = i;
      this.nodes = root;
    }
  }

  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }

    List<Depth> depthList = new ArrayList<>();
    depthList.add(
        new Depth(
            1,
            List.of(root)
        ));

    int index = 0;
    while (true) {
      Depth depth = depthList.get(index);
      Depth depth1 = new Depth(depth.depth + 1, new ArrayList<>());
      for (TreeNode node : depth.nodes) {
        TreeNode left = node.left;
        TreeNode right = node.right;

        if (left != null) {
          depth1.nodes.add(left);
        }

        if (right != null) {
          depth1.nodes.add(right);
        }
      }

      if (depth1.nodes.size() == 0) {
        break;
      }

      depthList.add(depth1);
      index++;
    }

    return depthList.size();
  }


}
//leetcode submit region end(Prohibit modification and deletion)
