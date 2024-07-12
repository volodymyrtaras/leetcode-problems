package vtaras.leetcode.problems.easy.p13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RomanToIntegerTest {

    @Test
    @SuppressWarnings(value = "SpellCheckingInspection")
    void testRomanToInt() {
        RomanToInteger romanToInteger = new RomanToInteger();

        Assertions.assertEquals(3, romanToInteger.romanToInt("III"));
        Assertions.assertEquals(58, romanToInteger.romanToInt("LVIII"));
        Assertions.assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));
    }
}
