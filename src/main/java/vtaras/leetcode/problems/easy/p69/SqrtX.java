package vtaras.leetcode.problems.easy.p69;

/*
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
 * The returned integer should be non-negative as well.
 * You must not use any built-in exponent function or operator.
 *
 * For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 *
 * Example 1:
 *
 * Input: x = 4
 * Output: 2
 * Explanation: The square root of 4 is 2, so we return 2.
 *
 * Example 2:
 *
 * Input: x = 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
 *
 * Constraints:
 *
 * 0 <= x <= 231 - 1
 */
@SuppressWarnings(value = "GrazieInspection")
public class SqrtX {

    /*
        - the square root of 0 is 0 and the square root of 1 is 1
        - in other case iterate from 2 to middle, maintain start and end pointers
        - while start is less or equal than end, calculate middle and square (use long to prevent overflow)
        - if square matches x, return middle as a result
        - if square is bigger than x, assign middle as end - 1
        - if square is less than x, assign middle as end - 1
        - when the loop ends, end will be the floor of the square root of x
     */
    public int mySqrt(int x) {
        int result = -1;

        if (x < 2) {
            result = x;
        } else {
            int start = 2;
            int end = x / 2;

            while (start <= end) {
                int middle = start + (end - start) / 2;
                long square = (long) middle * middle;

                if (square == x) {
                    result = middle;

                    break;
                } else if (square < x) {
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
            }

            if (result == -1) {
                result = end;
            }
        }

        return result;
    }
}
