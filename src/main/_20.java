//Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
// determine if the input string is valid.
//
// An input string is valid if:
//
//
// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
//
//
// Note that an empty string is also considered valid.
//
// Example 1:
//
//
//Input: "()"
//Output: true
//
//
// Example 2:
//
//
//Input: "()[]{}"
//Output: true
//
//
// Example 3:
//
//
//Input: "(]"
//Output: false
//
//
// Example 4:
//
//
//Input: "([)]"
//Output: false
//
//
// Example 5:
//
//
//Input: "{[]}"
//Output: true
//
// Related Topics String Stack
// 👍 5390 👎 228


import java.util.Objects;

//leetcode submit region begin(Prohibit modification and deletion)
class _20 {

  private enum Bracket {
    A("(", ")"),
    B("[", "]"),
    C("{", "}"),
    ;


    private final String start;
    private final String end;

    Bracket(String start, String end) {
      this.start = start;
      this.end = end;
    }

    public static Bracket search(String s) {
      for (Bracket bracket : Bracket.values()) {
        if (bracket.start.equals(s)) {
          return bracket;
        }
        ;
      }
      return null;
    }
  }

  public boolean isValid(String s) {
    if (s.length()%2 != 0){
      return false;
    }

    for (int length=0; length < s.length()/2; length++){
      String start = s.substring(length, length +1);
      Bracket search = Bracket.search(start);
      if (Objects.isNull(search)){
        return false;
      }

      int i = s.indexOf(search.end);
      if (i == -1){
        return false;
      }
      if (i == length +1){
        length++;
        continue;
      }
      String end = s.substring(s.length() -1 -length, s.length() - length);

      if (search.end.equals(end)){
        continue;
      }
      return false;
    }

    return true;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

