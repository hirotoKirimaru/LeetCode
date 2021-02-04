package com.example.leetCode;//Given a positive integer, return its corresponding column title as appear in a
//n Excel sheet.
//
// For example:
//
//
//    1 -> A
//    2 -> B
//    3 -> C
//    ...
//    26 -> Z
//    27 -> AA
//    28 -> AB
//    ...
//
//
// Example 1:
//
//
//Input: 1
//Output: "A"
//
//
// Example 2:
//
//
//Input: 28
//Output: "AB"
//
//
// Example 3:
//
//
//Input: 701
//Output: "ZY"
// Related Topics Math
// 👍 1546 👎 283


//leetcode submit region begin(Prohibit modification and deletion)
class _168 {

  private enum NumString {
    A(1),
    B(2),
    C(3),
    D(4),
    E(5),
    F(6),
    G(7),
    H(8),
    I(9),
    J(10),
    K(11),
    L(12),
    M(13),
    N(14),
    O(15),
    P(16),
    Q(17),
    R(18),
    S(19),
    T(20),
    U(21),
    V(22),
    W(23),
    X(24),
    Y(25),
    Z(26),
    ;
    private int num;

    NumString(int num) {
      this.num = num;
    }

    public static NumString getAlphabet(int num) {
      for (NumString value : values()) {
        if (value.num == num) {
          return value;
        }
      }
      return null;
    }
  }


  public String convertToTitle(int n) {

    String rtn = "";
    int tmp = 0;
    while (true) {
      if (n <= 26) {
        rtn += NumString.getAlphabet(n).toString();
        break;
      }

      tmp = n / 26;
      rtn += NumString.getAlphabet(tmp).toString();

      n = n % 26;

    }

    return rtn;
  }
}
//leetcode submit region end(Prohibit modification and deletion)
