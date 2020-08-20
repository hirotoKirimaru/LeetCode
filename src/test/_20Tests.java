import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _20Tests {
  _20 target = new _20();

  @Test
  void test_01(){
    boolean valid = target.isValid("()");
    assertEquals(valid, true);
  }

  @Test
  void test_02(){
    boolean valid = target.isValid("()[]{}");
    assertEquals(valid, true);
  }

  @Test
  void test_03(){
    boolean valid = target.isValid("(]");
    assertEquals(valid, false);
  }

  @Test
  void test_04(){
    boolean valid = target.isValid("([)]");
    assertEquals(valid, false);
  }

  @Test
  void test_05(){
    boolean valid = target.isValid("{[]}");
    assertEquals(valid, true);
  }

  @Test
  void test_06(){
    boolean valid = target.isValid("[");
    assertEquals(valid, false);
  }

  @Test
  void test_07(){
    boolean valid = target.isValid("{{)}");
    assertEquals(valid, false);
  }

  @Test
  void test_08(){
    boolean valid = target.isValid("(([]){})");
    assertEquals(valid, true);
  }
}
