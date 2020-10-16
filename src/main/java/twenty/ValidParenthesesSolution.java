/*

Valid Parentheses

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.

Example 1:

Input: s = "()"
Output: true

Example 2:

Input: s = "()[]{}"
Output: true

Example 3:

Input: s = "(]"
Output: false

Example 4:

Input: s = "([)]"
Output: false

Example 5:

Input: s = "{[]}"
Output: true

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.

*/

package twenty;

import java.util.Map;
import java.util.Stack;

public class ValidParenthesesSolution {

    private final Map<Character, Character> vocabulary = Map.of(
            ')', '(',
            '}', '{',
            ']', '[');

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (vocabulary.containsKey(c)) {
                char topElement = stack.empty() ? ' ' : stack.pop();

                if (topElement != vocabulary.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
