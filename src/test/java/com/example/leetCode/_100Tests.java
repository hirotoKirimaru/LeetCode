package com.example.leetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _100Tests {
  _100 target = new _100();

  @Test
  void test_01() {
    var p = new _100.TreeNode(1,
        new _100.TreeNode(2),
        new _100.TreeNode(3)
    );

    var q = new _100.TreeNode(1,
        new _100.TreeNode(2),
        new _100.TreeNode(3)
    );

    assertThat(
        target.isSameTree(p, q)
    ).isEqualTo(true);
  }

  @Test
  void test_02() {
    var p = new _100.TreeNode(1);
    p.left = new _100.TreeNode(2);

    var q = new _100.TreeNode(1);
    q.right = new _100.TreeNode(2);

    assertThat(
        target.isSameTree(p, q)
    ).isEqualTo(false);
  }

}
