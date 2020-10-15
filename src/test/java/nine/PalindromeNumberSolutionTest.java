package nine;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeNumberSolutionTest {

    private PalindromeNumberSolution palindromeNumberSolution;

    @Before
    public void setUp() {
        palindromeNumberSolution = new PalindromeNumberSolution();
    }

    @Test
    public void testIsPalindrome() {

        assertTrue(palindromeNumberSolution.isIntPalindrome(121));
        assertFalse(palindromeNumberSolution.isIntPalindrome(-121));
        assertFalse(palindromeNumberSolution.isIntPalindrome(-101));
        assertFalse(palindromeNumberSolution.isIntPalindrome(10));
        assertTrue(palindromeNumberSolution.isIntPalindrome(0));
        assertTrue(palindromeNumberSolution.isIntPalindrome(5));
    }
}