package vtaras.leetcode.problems.easy.p66;

/*
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
 * The digits are ordered from most significant to the least significant in left-to-right order.
 * The large integer does not contain any leading 0's.
 * Increment the large integer by one and return the resulting array of digits.
 *
 * Example 1:
 *
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.
 * Thus, the result should be [1,2,4].
 *
 * Example 2:
 *
 * Input: digits = [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 * Incrementing by one gives 4321 + 1 = 4322.
 * Thus, the result should be [4,3,2,2].
 *
 * Example 3:
 *
 * Input: digits = [9]
 * Output: [1,0]
 * Explanation: The array represents the integer 9.
 * Incrementing by one gives 9 + 1 = 10.
 * Thus, the result should be [1,0].
 *
 *
 * Constraints:
 *
 * 1 <= digits.length <= 100
 * 0 <= digits[i] <= 9
 * digits does not contain any leading 0's.
 */
@SuppressWarnings(value = "GrazieInspection")
public class PlusOne {

    /*
        - traverse array from the end
        - increment and check if now value is 10
        - if so, set value to 0 and increment previous value
        - break if current value is not 10
        - create new array with 1 at the beginning if first digit is 0 after processing
    */
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = digits[i] + 1;

            if (digits[i] == 10) {
                digits[i] = 0;
            } else {
                break;
            }
        }

        return digits[0] == 0 ?
            addOneToTheArrayStart(digits) :
            digits;
    }

    private int[] addOneToTheArrayStart(int[] digits) {
        int[] newArray = new int[digits.length + 1];

        newArray[0] = 1;

        int digitsIndex = 0;
        for (int i = 1; i < newArray.length; i++) {
            newArray[i] = digits[digitsIndex];

            digitsIndex++;
        }

        return newArray;
    }
}
