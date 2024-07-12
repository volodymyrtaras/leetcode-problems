package vtaras.leetcode.problems.easy.p20;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.Objects;

/*
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 *
 * Example 1:
 *
 * Input: s = "()"
 * Output: true
 *
 * Example 2:
 *
 * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 *
 * Input: s = "(]"
 * Output: false
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 */
public class ValidParentheses {

    /*
        - establish reversed dictionary - closing brackets as keys
        - define LIFO collection
        - iterate characters, checking if corresponding value is on top of collection
        - if yes, remove from collection, otherwise add
     */
    public boolean isValid(String s) {
        Deque<Character> characterDeque = new ArrayDeque<>();
        Map<Character, Character> parenthesesMap = Map.of(
            '}', '{',
            ']', '[',
            ')', '('
        );

        for (char c : s.toCharArray()) {
            Character correspondingCharacter = parenthesesMap.get(c);

            if (!characterDeque.isEmpty() && Objects.equals(characterDeque.peek(), correspondingCharacter)) {
                characterDeque.remove();
            } else {
                characterDeque.push(c);
            }
        }

        return characterDeque.isEmpty();
    }
}
