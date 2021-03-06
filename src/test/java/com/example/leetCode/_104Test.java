package com.example.leetCode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class _104Test {
  _104 target = new _104();

  @Test
  void test_01() {
    _104.TreeNode root = new _104.TreeNode(3);
    _104.TreeNode left = new _104.TreeNode(9);
    _104.TreeNode right1 = new _104.TreeNode(20);
    _104.TreeNode right1_1 = new _104.TreeNode(15);
    _104.TreeNode right1_2 = new _104.TreeNode(7);

    root.left = left;
    root.right = right1;
    right1.left = right1_1;
    right1.right = right1_2;

    int actual = target.maxDepth(root);
    Assertions.assertThat(actual).isEqualTo(3);
  }

  @Test
  void test_02() {
    _104.TreeNode root = new _104.TreeNode(1);
    _104.TreeNode right1 = new _104.TreeNode(2);
    root.right = right1;

    int actual = target.maxDepth(root);
    Assertions.assertThat(actual).isEqualTo(2);
  }

  @Test
  void test_03() {
    int actual = target.maxDepth(null);
    Assertions.assertThat(actual).isEqualTo(0);
  }

  @Test
  void test_04() {
    _104.TreeNode root = new _104.TreeNode(0);

    int actual = target.maxDepth(root);
    Assertions.assertThat(actual).isEqualTo(1);
  }


  @Test
  void test_05() {
    _104.TreeNode root = new _104.TreeNode(1);
    _104.TreeNode left = new _104.TreeNode(2);
    _104.TreeNode left_1 = new _104.TreeNode(3);
    _104.TreeNode left_2 = new _104.TreeNode(4);
    _104.TreeNode right = new _104.TreeNode(5);
    root.left = left;
    left.left = left_1;
    left.left = left_2;
    root.right = right;

    int actual = target.maxDepth(root);
    Assertions.assertThat(actual).isEqualTo(3);
  }

  @Disabled("構造が分からん")
  @Test
  void test_06() {

//[3,4,5,-7,-6,null,null,-7,null,-5,null,null,null,-4]
    _104.TreeNode root = new _104.TreeNode(3);
    _104.TreeNode left = new _104.TreeNode(4);
    _104.TreeNode right = new _104.TreeNode(5);
    _104.TreeNode left_1 = new _104.TreeNode(-7);
    _104.TreeNode left_2 = new _104.TreeNode(-6);
    _104.TreeNode left_2_1 = new _104.TreeNode(-7);

    root.left = left;
    left.left = left_1;
    left.right = left_2;
    left_2.left = left_2_1;
    root.right = right;


    int actual = target.maxDepth(root);
    Assertions.assertThat(actual).isEqualTo(5);
  }


}
