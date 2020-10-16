/*

Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

Constraints:

0 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lower-case English letters.

*/

package fourteen;

public class LongestCommonPrefixSolution {

    public String longestCommonPrefix(String[] strs) {

        StringBuilder sb = new StringBuilder();
        int occurrences;

        if (strs.length == 0) {
            return "";
        }

        for (int i = 0; i < strs[0].toCharArray().length; i++) {

            char current = strs[0].charAt(i);
            occurrences = 0;

            for (String str : strs) {
                if (i >= str.length()) {
                    return sb.toString();
                }

                if (current == str.charAt(i)) {
                    occurrences++;
                }
            }

            if (occurrences == strs.length) {
                sb.append(current);
            } else {
                return sb.toString();
            }
        }

        return sb.toString();
    }

    public String longestCommonPrefixWithHorizontalScanning(String[] strs) {

        if (strs.length == 0) {
            return "";
        }

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }

        return prefix;
    }

    public String longestCommonPrefixWithVerticalScanning(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0];
    }

    public String longestCommonPrefixDivideAndConquer(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        return longestCommonPrefix(strs, 0, strs.length - 1);
    }

    public String longestCommonPrefixWithBinarySearch(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        int minLength = Integer.MAX_VALUE;

        for (String str : strs) {
            minLength = Math.min(minLength, str.length());
        }

        int low = 1;
        int high = minLength;

        while (low <= high) {

            int middle = (low + high) / 2;
            if (isCommonPrefix(strs, middle)) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }

        return strs[0].substring(0, (low + high) / 2);
    }

    private boolean isCommonPrefix(String[] strs, int length) {

        String prefix = strs[0].substring(0, length);

        for (int i = 1; i < strs.length; i++) {
            if (!strs[i].startsWith(prefix)) {
                return false;
            }
        }

        return true;
    }

    private String longestCommonPrefix(String[] strs, int left, int right) {

        if (left == right) {
            return strs[left];
        } else {
            int mid = (left + right) / 2;
            String lcpLeft = longestCommonPrefix(strs, left, mid);
            String lcpRight = longestCommonPrefix(strs, mid + 1, right);

            return commonPrefix(lcpLeft, lcpRight);
        }
    }

    private String commonPrefix(String left, String right) {

        int min = Math.min(left.length(), right.length());

        for (int i = 0; i < min; i++) {
            if (left.charAt(i) != right.charAt(i)) {
                return left.substring(0, i);
            }
        }

        return left.substring(0, min);
    }
}
