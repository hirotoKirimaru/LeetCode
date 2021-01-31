package com.example.leetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _112Tests {
  _112 target = new _112();

  @Test
  void test_01() {
    _112.TreeNode root = new _112.TreeNode(5);

    _112.TreeNode left = new _112.TreeNode(4);
    _112.TreeNode right = new _112.TreeNode(8);

    _112.TreeNode left_left = new _112.TreeNode(11);
    _112.TreeNode left_left_left = new _112.TreeNode(7);
    _112.TreeNode left_left_right = new _112.TreeNode(2);

    _112.TreeNode rihgt_left = new _112.TreeNode(13);
    _112.TreeNode right_right = new _112.TreeNode(4);
    _112.TreeNode right_right_right = new _112.TreeNode(1);

    root.left = left;
    root.right = right;

    left.left = left_left;
    left_left.left = left_left_left;
    left_left.right = left_left_right;

    right.left = rihgt_left;
    right.right = right_right;
    right_right.right = right_right_right;


    assertThat(target.hasPathSum(root, 22)).isEqualTo(true);
  }

  @Test
  void test_02() {
    _112.TreeNode root = new _112.TreeNode(1);

    _112.TreeNode left = new _112.TreeNode(2);
    _112.TreeNode right = new _112.TreeNode(3);

    root.left = left;
    root.right = right;

    assertThat(target.hasPathSum(root, 5)).isEqualTo(false);
  }

  @Test
  void test_03() {
    _112.TreeNode root = new _112.TreeNode(1);

    _112.TreeNode left = new _112.TreeNode(2);

    root.left = left;

    assertThat(target.hasPathSum(root, 0)).isEqualTo(false);
  }

}
