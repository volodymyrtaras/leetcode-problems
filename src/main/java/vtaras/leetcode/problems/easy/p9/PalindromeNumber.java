package vtaras.leetcode.problems.easy.p9;

/*
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 *
 * Example 1:
 *
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 *
 * Example 2:
 *
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore, it is not a palindrome.
 *
 * Example 3:
 *
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore, it is not a palindrome.
 *
 * Constraints:
 *
 * -231 <= x <= 231 - 1
 */
public class PalindromeNumber {

    /*
        - store original number
        - if number is less than 0, it is not a palindrome
        - using math operations, revert original number
        - check equality
     */
    public boolean isPalindrome(int x) {
        int originalNumber = x;
        int reversed = 0;

        if (x < 0) {
            x *= -1;
        }

        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        return reversed == originalNumber;
    }
}
