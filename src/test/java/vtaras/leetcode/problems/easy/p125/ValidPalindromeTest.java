package vtaras.leetcode.problems.easy.p125;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidPalindromeTest {

    private final ValidPalindrome validPalindrome = new ValidPalindrome();

    @Test
    void testPalindrome1() {
        String input = "A man, a plan, a canal: Panama";

        Assertions.assertTrue(validPalindrome.isPalindrome(input));
    }

    @Test
    void testPalindrome2() {
        String input = "race a car";

        Assertions.assertFalse(validPalindrome.isPalindrome(input));
    }

    @Test
    void testEmptyString() {
        String input = " ";

        Assertions.assertTrue(validPalindrome.isPalindrome(input));
    }

    @Test
    void testSingleCharacter() {
        String input = "a";

        Assertions.assertTrue(validPalindrome.isPalindrome(input));
    }

    @Test
    void testNonAlphanumeric() {
        String input = "@@##$$";

        Assertions.assertTrue(validPalindrome.isPalindrome(input));
    }

    @Test
    void testLongPalindrome() {
        String input = "Able was I, ere I saw Elba";

        Assertions.assertTrue(validPalindrome.isPalindrome(input));
    }

    @Test
    void testNotPalindrome() {
        String input = "palindrome";

        Assertions.assertFalse(validPalindrome.isPalindrome(input));
    }

    @Test
    void testLettersAndDigits() {
        String input = "0P";

        Assertions.assertFalse(validPalindrome.isPalindrome(input));
    }
}
