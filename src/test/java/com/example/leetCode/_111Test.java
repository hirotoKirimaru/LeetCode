package com.example.leetCode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _111Test {
  _111 target = new _111();

  @Test
  void test_01(){
    _111.TreeNode root = new _111.TreeNode(3);
    _111.TreeNode left = new _111.TreeNode(9);
    _111.TreeNode right = new _111.TreeNode(20);
    _111.TreeNode right_left = new _111.TreeNode(15);
    _111.TreeNode right_right = new _111.TreeNode(7);

    root.left = left;
    root.right = right;
    right.left = right_left;
    right.right = right_right;

    int actual = target.minDepth(root);
    Assertions.assertThat(actual).isEqualTo(2);
  }

  @Test
  void test_02(){
    _111.TreeNode root = new _111.TreeNode(2);
    _111.TreeNode right = new _111.TreeNode(3);
    _111.TreeNode right_right = new _111.TreeNode(4);
    _111.TreeNode right_right_right = new _111.TreeNode(5);
    _111.TreeNode right_right_right_right = new _111.TreeNode(6);

    root.right = right;
    right.right = right_right;
    right_right.right = right_right_right;
    right_right_right.right = right_right_right_right;

    int actual = target.minDepth(root);
    Assertions.assertThat(actual).isEqualTo(5);
  }
}
