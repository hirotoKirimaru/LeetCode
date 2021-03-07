package com.example.leetCode;//International Morse Code defines a standard encoding where each letter is mapp
//ed to a series of dots and dashes, as follows: "a" maps to ".-", "b" maps to "-.
//..", "c" maps to "-.-.", and so on.
//
// For convenience, the full table for the 26 letters of the English alphabet is
// given below:
//
//
//[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--
//","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.
//."]
//
// Now, given a list of words, each word can be written as a concatenation of th
//e Morse code of each letter. For example, "cab" can be written as "-.-..--...",
//(which is the concatenation "-.-." + ".-" + "-..."). We'll call such a concatena
//tion, the transformation of a word.
//
// Return the number of different transformations among all words we have.
//
//
//Example:
//Input: words = ["gin", "zen", "gig", "msg"]
//Output: 2
//Explanation:
//The transformation of each word is:
//"gin" -> "--...-."
//"zen" -> "--...-."
//"gig" -> "--...--."
//"msg" -> "--...--."
//
//There are 2 different transformations, "--...-." and "--...--.".
//
//
// Note:
//
//
// The length of words will be at most 100.
// Each words[i] will have length in range [1, 12].
// words[i] will only consist of lowercase letters.
//
// Related Topics String
// 👍 886 👎 816


import java.util.HashSet;
import java.util.Set;

//leetcode submit region begin(Prohibit modification and deletion)
class _804 {

  public enum Conv {
    A(97, ".-"),
    B(98, "-..."),
    C(99, "-.-."),
    D(100, "-.."),
    E(101, "."),
    F(102, "..-."),
    G(103, "--."),
    H(104, "...."),
    I(105, ".."),
    J(106, ".---"),
    K(107, "-.-"),
    L(108, ".-.."),
    M(109, "--"),
    N(110, "-."),
    O(111, "---"),
    P(112, ".--."),
    Q(113, "--.-"),
    R(114, ".-."),
    S(115, "..."),
    T(116, "-"),
    U(117, "..-"),
    V(118, "...-"),
    W(119, ".--"),
    X(120, "-..-"),
    Y(121, "-.--"),
    Z(122, "--..");

    int charactor;
    String value;

    Conv(int i, String s) {
      this.charactor = i;
      this.value = s;
    }

    public static String toConv(char charactor) {
      for (Conv conv : Conv.values()) {
        if (conv.charactor == charactor) {
          return conv.value;
        }
      }
      throw new RuntimeException("");
    }

  }

  public int uniqueMorseRepresentations(String[] words) {
    Set<String> rtn = new HashSet();

    for (String word : words) {
      String conv = "";
      for (char c : word.toCharArray()) {
        conv += Conv.toConv(c);
      }
      rtn.add(conv);
    }

    return rtn.size();
  }
}
//leetcode submit region end(Prohibit modification and deletion)
