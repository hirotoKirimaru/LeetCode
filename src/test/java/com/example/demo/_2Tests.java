package com.example.demo;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

class _2Tests {
  _2 target = new _2();

  @Test
  void test_01() {
    _2.ListNode param1_1 = new _2.ListNode(2);
    _2.ListNode param1_2 = new _2.ListNode(4);
    _2.ListNode param1_3 = new _2.ListNode(3);

    param1_1.next = param1_2;
    param1_2.next = param1_3;

    _2.ListNode param2_1 = new _2.ListNode(5);
    _2.ListNode param2_2 = new _2.ListNode(6);
    _2.ListNode param2_3 = new _2.ListNode(4);

    param2_1.next = param2_2;
    param2_2.next = param2_3;

    _2.ListNode actual = target.addTwoNumbers(param1_1, param2_1);

    SoftAssertions softly = new SoftAssertions();
    softly.assertThat(actual.val).isEqualTo(7);
    softly.assertThat(actual.next.val).isEqualTo(0);
    softly.assertThat(actual.next.next.val).isEqualTo(8);
    softly.assertAll();

  }

  @Test
  void test_02() {
    _2.ListNode param1_1 = new _2.ListNode(0);

    _2.ListNode param2_1 = new _2.ListNode(5);

    _2.ListNode actual = target.addTwoNumbers(param1_1, param2_1);

    SoftAssertions softly = new SoftAssertions();
    softly.assertThat(actual.val).isEqualTo(0);
    softly.assertAll();

  }

  @Test
  void test_03() {
    _2.ListNode param1_1 = new _2.ListNode(9);
    _2.ListNode param1_2 = new _2.ListNode(9);
    _2.ListNode param1_3 = new _2.ListNode(9);
    _2.ListNode param1_4 = new _2.ListNode(9);
    _2.ListNode param1_5 = new _2.ListNode(9);
    _2.ListNode param1_6 = new _2.ListNode(9);
    _2.ListNode param1_7 = new _2.ListNode(9);

    param1_1.next = param1_2;
    param1_2.next = param1_3;
    param1_3.next = param1_4;
    param1_4.next = param1_5;
    param1_5.next = param1_6;
    param1_6.next = param1_7;

    _2.ListNode param2_1 = new _2.ListNode(9);
    _2.ListNode param2_2 = new _2.ListNode(9);
    _2.ListNode param2_3 = new _2.ListNode(9);
    _2.ListNode param2_4 = new _2.ListNode(9);

    param2_1.next = param2_2;
    param2_2.next = param2_3;
    param2_3.next = param2_4;

    _2.ListNode actual = target.addTwoNumbers(param1_1, param2_1);

    SoftAssertions softly = new SoftAssertions();
    softly.assertThat(actual.val).isEqualTo(8);
    softly.assertThat(actual.next.val).isEqualTo(9);
    softly.assertThat(actual.next.next.val).isEqualTo(9);
    softly.assertThat(actual.next.next.next.val).isEqualTo(9);
    softly.assertThat(actual.next.next.next.next.val).isEqualTo(0);
    softly.assertThat(actual.next.next.next.next.next.val).isEqualTo(0);
    softly.assertThat(actual.next.next.next.next.next.next.val).isEqualTo(0);
    softly.assertThat(actual.next.next.next.next.next.next.next.val).isEqualTo(1);
    softly.assertAll();

  }

  @Disabled("桁あふれをいい感じにする")
  @Test
  void test_04() {
    _2.ListNode param1_1 = new _2.ListNode(9);

    _2.ListNode param2_1 = new _2.ListNode(1);
    _2.ListNode param2_2 = new _2.ListNode(9);
    _2.ListNode param2_3 = new _2.ListNode(9);
    _2.ListNode param2_4 = new _2.ListNode(9);
    _2.ListNode param2_5 = new _2.ListNode(9);
    _2.ListNode param2_6 = new _2.ListNode(9);
    _2.ListNode param2_7 = new _2.ListNode(9);
    _2.ListNode param2_8 = new _2.ListNode(9);
    _2.ListNode param2_9 = new _2.ListNode(9);
    _2.ListNode param2_10 = new _2.ListNode(9);

    param2_1.next = param2_2;
    param2_2.next = param2_3;
    param2_3.next = param2_4;
    param2_4.next = param2_5;
    param2_5.next = param2_6;
    param2_6.next = param2_7;
    param2_7.next = param2_8;
    param2_8.next = param2_9;
    param2_9.next = param2_10;


    try {
      _2.ListNode actual = target.addTwoNumbers(param1_1, param2_1);
    } catch (Exception e) {
      fail();
    }
  }

}
