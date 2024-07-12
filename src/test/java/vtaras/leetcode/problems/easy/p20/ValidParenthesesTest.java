package vtaras.leetcode.problems.easy.p20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidParenthesesTest {

    @Test
    void testIsValid() {
        ValidParentheses validParentheses = new ValidParentheses();

        Assertions.assertTrue(validParentheses.isValid("()"));
        Assertions.assertTrue(validParentheses.isValid("()[]{}"));
        Assertions.assertTrue(validParentheses.isValid("({[]})"));
        Assertions.assertFalse(validParentheses.isValid("(]"));
        Assertions.assertFalse(validParentheses.isValid("[(])"));
    }
}