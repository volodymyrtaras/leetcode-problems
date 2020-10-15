/*

Reverse Integer

Given a 32-bit signed integer, reverse digits of an integer.

Note:

Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231,  231 − 1].
For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

Example 1:

Input: x = 123
Output: 321

Example 2:

Input: x = -123
Output: -321

Example 3:

Input: x = 120
Output: 21

Example 4:

Input: x = 0
Output: 0

Constraints:

-231 <= x <= 231 - 1

*/

package seven;

public class ReverseIntegerSolution {

    public int reverseWithStringBuilder(int x) {

        String s = String.valueOf(x);
        if (s.startsWith("-")) {
            s = new StringBuilder(s)
                    .reverse()
                    .deleteCharAt(s.length() - 1)
                    .insert(0, "-")
                    .toString();
        } else {
            s = new StringBuilder(s).reverse().toString();
        }

        long l = Long.parseLong(s);

        if (l < Integer.MIN_VALUE || l > Integer.MAX_VALUE) {
            return 0;
        }

        return Integer.parseInt(s);
    }

    public int reverseWithStringBuilderAndMath(int x) {

        String reversed = new StringBuilder()
                .append(Math.abs(x))
                .reverse()
                .toString();

        try {
            return (x < 0) ? Integer.parseInt(reversed) * - 1 : Integer.parseInt(reversed);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public int reverseWithoutLibraryClasses(int x) {

        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
        }

        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int) res;
        }
    }
}
