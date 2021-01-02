package com.exmaple.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.example.leetCode._1598;

class _1598Tests {
  public _1598 target = new _1598();

  @Test
  void test_01() {
    String[] dir = {"./"};
    int actual = target.minOperations(dir);
    assertEquals(0, actual);
  }

  @Test
  void test_02() {
    String[] dir = {"d1/", "d2/", "../", "d21/", "./"};
    int actual = target.minOperations(dir);
    assertEquals(2, actual);
  }

  @Test
  void test_03() {
    String[] dir = {"d1/","d2/","./","d3/","../","d31/"};
    int actual = target.minOperations(dir);
    assertEquals(3, actual);
  }

  @Test
  void test_04() {
    String[] dir = {"d1/","../","../","../"};
    int actual = target.minOperations(dir);
    assertEquals(0, actual);
  }
}
