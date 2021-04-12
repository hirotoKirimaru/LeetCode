package com.example.leetCode;
//Given an array A of non-negative integers, return an array consisting of all t
//he even elements of A, followed by all the odd elements of A.
//
// You may return any answer array that satisfies this condition.
//
//
//
//
// Example 1:
//
//
//Input: [3,1,2,4]
//Output: [2,4,3,1]
//The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
//
//
//
//
// Note:
//
//
// 1 <= A.length <= 5000
// 0 <= A[i] <= 5000
//
//
// Related Topics Array
// 👍 1638 👎 88


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class _905{
  // パリティ？
  public int[] sortArrayByParity(int[] A) {
    return Arrays.stream(A)
        .boxed()
        .sorted((a, b) -> Integer.compare(a%2, b%2))
        .mapToInt(i -> i)
        .toArray();
  }
}
//leetcode submit region end(Prohibit modification and deletion)
