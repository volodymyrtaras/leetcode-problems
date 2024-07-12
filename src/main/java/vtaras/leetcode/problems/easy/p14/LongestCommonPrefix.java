package vtaras.leetcode.problems.easy.p14;

/*
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
 *
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 *
 * Example 2:
 *
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix amongst the input strings.
 *
 * Constraints:
 *
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lowercase English letters.
 */
@SuppressWarnings(value = "SpellCheckingInspection")
public class LongestCommonPrefix {

    /*
        - pick 1st string as common prefix
        - iterate other strings, checking if they start with it
        - if no, substring and continue
        - stop iterating if prefix is empty
     */
    public String longestCommonPrefix(String[] strs) {
        String commonPrefix;

        if (strs.length == 0) {
            commonPrefix = "";
        } else {
            String prefix = strs[0];

            for (int i = 1; i < strs.length; i++) {
                while (!strs[i].startsWith(prefix)) {
                    prefix = prefix.substring(0, prefix.length() - 1);

                    if (prefix.isEmpty()) {
                        break;
                    }
                }
            }

            commonPrefix = prefix;
        }

        return commonPrefix;
    }
}
