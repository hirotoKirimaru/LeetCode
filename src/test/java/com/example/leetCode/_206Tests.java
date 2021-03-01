package com.example.leetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _206Tests {
  _206 target = new _206();

  @Test
  void test_01() {
    _206.ListNode param = new _206.ListNode(1,
        new _206.ListNode(2,
            new _206.ListNode(3,
                new _206.ListNode(4,
                    new _206.ListNode(5))
            )
        )
    );

    _206.ListNode actual = target.reverseList(param);

    assertThat(actual.val).isEqualTo(5);
    assertThat(actual.next.val).isEqualTo(4);
    assertThat(actual.next.next.val).isEqualTo(3);
    assertThat(actual.next.next.next.val).isEqualTo(2);
    assertThat(actual.next.next.next.next.val).isEqualTo(1);
  }
}
