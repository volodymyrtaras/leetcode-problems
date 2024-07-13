package vtaras.leetcode.problems.easy.p28;

/*
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Example 1:
 *
 * Input: haystack = "sadbutsad", needle = "sad"
 * Output: 0
 * Explanation: "sad" occurs at index 0 and 6.
 * The first occurrence is at index 0, so we return 0.
 *
 * Example 2:
 *
 * Input: haystack = "leetcode", needle = "leeto"
 * Output: -1
 * Explanation: "leeto" did not occur in "leetcode", so we return -1.
 *
 *
 * Constraints:
 *
 * 1 <= haystack.length, needle.length <= 104
 * haystack and needle consist of only lowercase English characters.
 */
@SuppressWarnings(value = "SpellCheckingInspection")
public class FindTheIndexOfTheFirstOccurrenceInAString {

    /*
        - define index as -1
        - iterate the haystack and check if the remaining string starts with needle
     */
    public int strStr(String haystack, String needle) {
        int index = -1;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.startsWith(needle, i)) {
                index = i;

                break;
            }
        }

        return index;
    }

    /*
        - iterate the haystack until it is not place for needle
        - inside it iterate needle and check until characters do not match
        - if length of the needle match index of needle iteration, return index of haystack
     */
    public int strStrWithoutMethodsOfClassString(String haystack, String needle) {
        int index = -1;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j;

            for (j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }

            if (j == needle.length()) {
                index = i;

                break;
            }
        }

        return index;
    }
}
