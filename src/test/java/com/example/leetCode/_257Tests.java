package com.example.leetCode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _257Tests {
  _257 target = new _257();

  @Test
  void test_01() {
    List<String> actual = target.binaryTreePaths(null);

    assertThat(actual).isEqualTo(
        List.of("1->2->5", "1->3")
    );
  }
}
