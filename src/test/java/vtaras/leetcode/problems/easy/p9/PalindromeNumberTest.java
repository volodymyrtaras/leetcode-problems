package vtaras.leetcode.problems.easy.p9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeNumberTest {

    @Test
    void testIsPalindrome() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();

        Assertions.assertTrue(palindromeNumber.isPalindrome(121));
        Assertions.assertTrue(palindromeNumber.isPalindrome(0));
        Assertions.assertTrue(palindromeNumber.isPalindrome(1001));
        Assertions.assertTrue(palindromeNumber.isPalindrome(12321));
        Assertions.assertFalse(palindromeNumber.isPalindrome(-121));
        Assertions.assertFalse(palindromeNumber.isPalindrome(10));
    }
}
