package twenty;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidParenthesesSolutionTest {

    private ValidParenthesesSolution validParenthesesSolution;

    @Before
    public void setUp() {
        validParenthesesSolution = new ValidParenthesesSolution();
    }

    @Test
    public void testIsValid() {

        assertTrue(validParenthesesSolution.isValid("()[]{}"));
        assertTrue(validParenthesesSolution.isValid("{}"));
        assertTrue(validParenthesesSolution.isValid("()"));
        assertTrue(validParenthesesSolution.isValid("{[]}"));
        assertTrue(validParenthesesSolution.isValid("{[()]}"));
        assertFalse(validParenthesesSolution.isValid("(]"));
        assertFalse(validParenthesesSolution.isValid("([)]"));
        assertFalse(validParenthesesSolution.isValid("(("));
        assertFalse(validParenthesesSolution.isValid("]"));
        assertFalse(validParenthesesSolution.isValid("]["));
        assertTrue(validParenthesesSolution.isValid("[({(())}[()])]"));
    }
}
