package vtaras.leetcode.problems.easy.p14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestCommonPrefixTest {

    @Test
    @SuppressWarnings(value = "SpellCheckingInspection")
    void testLongestCommonPrefix() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

        Assertions.assertEquals("fl", longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        Assertions.assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }
}
