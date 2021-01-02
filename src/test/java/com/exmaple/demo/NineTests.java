package com.exmaple.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.leetCode._9;

class NineTests {
  @Test
  void test_01(){
    _9 nine = new _9();
    boolean palindrome = nine.isPalindrome(123);

    assertEquals(palindrome, false);
  }

  @Test
  void test_02(){
    _9 nine = new _9();
    boolean palindrome = nine.isPalindrome(12321);

    assertEquals(palindrome, true);
  }
}
