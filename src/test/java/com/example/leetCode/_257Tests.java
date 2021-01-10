package com.example.leetCode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _257Tests {
  _257 target = new _257();

  @Test
  void test_01() {
    _257.TreeNode root = new _257.TreeNode(1);
    _257.TreeNode left = new _257.TreeNode(2);
    _257.TreeNode right = new _257.TreeNode(3);
    _257.TreeNode left_right = new _257.TreeNode(5);
    root.left = left;
    root.right = right;
    left.left = left_right;

    List<String> actual = target.binaryTreePaths(root);

    assertThat(actual).isEqualTo(
        List.of("1->2->5", "1->3")
    );
  }

  @Test
  void test_02() {
    List<String> actual = target.binaryTreePaths(null);

    assertThat(actual).isEqualTo(
        List.of()
    );
  }

  @Test
  void test_03() {
    _257.TreeNode root = new _257.TreeNode(1);


    List<String> actual = target.binaryTreePaths(root);

    assertThat(actual).isEqualTo(
        List.of("1")
    );
  }
}
