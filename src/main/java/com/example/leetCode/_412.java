package com.example.leetCode;//Write a program that outputs the string representation of numbers from 1 to n.
//
//
// But for multiples of three it should output “Fizz” instead of the number and
//for the multiples of five output “Buzz”. For numbers which are multiples of both
// three and five output “FizzBuzz”.
//
// Example:
//
//n = 15,
//
//Return:
//[
//    "1",
//    "2",
//    "Fizz",
//    "4",
//    "Buzz",
//    "Fizz",
//    "7",
//    "8",
//    "Fizz",
//    "Buzz",
//    "11",
//    "Fizz",
//    "13",
//    "14",
//    "FizzBuzz"
//]
//
// 👍 1174 👎 1448


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class _412 {
  public List<String> fizzBuzz(int n) {
    List<String> rtn = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      rtn.add(convert(n));
    }
    return rtn;
  }

  private String convert(int n) {
    return String.valueOf(n);
  }
}
//leetcode submit region end(Prohibit modification and deletion)
