package vtaras.leetcode.problems.easy.p67;

import java.util.ArrayList;
import java.util.List;

/*
 * Given two binary strings a and b, return their sum as a binary string.
 *
 * Example 1:
 *
 * Input: a = "11", b = "1"
 * Output: "100"
 *
 * Example 2:
 *
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 *
 * Constraints:
 *
 * 1 <= a.length, b.length <= 104
 * a and b consist only of '0' or '1' characters.
 * Each string does not contain leading zeros except for the zero itself.
 */
public class AddBinary {

    /*
        - maintain indexes of both numbers, iterating from the end create a carry variable (0 by default)
        - iterate till indexes exist or carry is bigger than 0
        - result for 2 digits will be the carry + digit A + digit B
        - if result is equal or less than 1, carry is 0 and result is 0 / 1
        - if result is 2, carry is 1 and result is 0
        - if result is 3, carry is 1 and result is 1
        - add digits to StringBuilder, reverse and return it as a string
     */
    public String addBinary(String a, String b) {
        int indexA = a.length() - 1;
        int indexB = b.length() - 1;
        int carry = 0;

        List<Character> characterList = new ArrayList<>();

        while (indexA >= 0 || indexB >= 0 || carry > 0) {
            int result = getResult(a, b, indexA, indexB, carry);

            if (result == 0) {
                carry = 0;
                characterList.add('0');
            } else if (result == 1) {
                carry = 0;
                characterList.add('1');
            } else if (result == 2) {
                carry = 1;
                characterList.add('0');
            } else if (result == 3) {
                carry = 1;
                characterList.add('1');
            }

            indexA--;
            indexB--;
        }

        return reverseListAndComposeNumber(characterList);
    }

    /*
     * Chars subtraction happens according to the ASCII table
     *
     * Example:
     *
     * '0' has an ASCII value of 48
     * '1' has an ASCII value of 49
     * '2' has an ASCII value of 50
     *
     * '1' - '0' = 49 - 48 = 1
     *
     * So it is a simple way how to convert char to int in Java
     */
    private int getResult(String a, String b, int indexA, int indexB, int carry) {
        int result = carry;

        if (indexA >= 0) {
            result += a.charAt(indexA) - '0';
        }

        if (indexB >= 0) {
            result += b.charAt(indexB) - '0';
        }

        return result;
    }

    private String reverseListAndComposeNumber(List<Character> characterList) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = characterList.size() - 1; i >= 0; i--) {
            stringBuilder.append(characterList.get(i));
        }

        return stringBuilder.toString();
    }
}
