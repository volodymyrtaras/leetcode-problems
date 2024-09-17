package vtaras.leetcode.problems.easy.p125;

/*
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward.
 * Alphanumeric characters include letters and numbers.
 * Given a string s, return true if it is a palindrome, or false otherwise.
 *
 * Example 1:
 *
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 *
 * Example 2:
 *
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 *
 * Example 3:
 *
 * Input: s = " "
 * Output: true
 * Explanation: s is an empty string "" after removing non-alphanumeric characters.
 * Since an empty string reads the same forward and backward, it is a palindrome.
 *
 * Constraints:
 *
 * 1 <= s.length <= 2 * 105
 * s consists only of printable ASCII characters.
 */
@SuppressWarnings(value = "SpellCheckingInspection")
public class ValidPalindrome {

    /*
        - initialize boolean variable and set it to 'true' for blank strings
        - initialize variables to keep start and end indexes
        - iterate until start is not bigger than end
        - skip all characters from left and right if they are not letter or digit
        - compare lower-cased characters on start and end indexes
        - return false if they do not match
     */
    public boolean isPalindrome(String s) {
        boolean isPalindrome = true;
        int start = 0;
        int end = s.length() - 1;

        while (start <= end) {
            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }

            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }

            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                isPalindrome = false;

                break;
            }

            start++;
            end--;
        }

        return isPalindrome;
    }
}
