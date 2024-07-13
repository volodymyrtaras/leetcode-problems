package vtaras.leetcode.problems.easy.p28;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindTheIndexOfTheFirstOccurrenceInAStringTest {

    @Test
    @SuppressWarnings(value = "SpellCheckingInspection")
    void testStrStr() {
        FindTheIndexOfTheFirstOccurrenceInAString findTheIndexOfTheFirstOccurrenceInAString = new FindTheIndexOfTheFirstOccurrenceInAString();

        Assertions.assertEquals(0, findTheIndexOfTheFirstOccurrenceInAString.strStr("sadbutsad", "sad"));
        Assertions.assertEquals(-1, findTheIndexOfTheFirstOccurrenceInAString.strStr("leetcode", "leeto"));
        Assertions.assertEquals(-1, findTheIndexOfTheFirstOccurrenceInAString.strStr("aaa", "aaaa"));
        Assertions.assertEquals(4, findTheIndexOfTheFirstOccurrenceInAString.strStr("mississippi", "issip"));
    }

    @Test
    @SuppressWarnings(value = "SpellCheckingInspection")
    void testStrStrWithoutMethodsOfClassString() {
        FindTheIndexOfTheFirstOccurrenceInAString findTheIndexOfTheFirstOccurrenceInAString = new FindTheIndexOfTheFirstOccurrenceInAString();

        Assertions.assertEquals(0, findTheIndexOfTheFirstOccurrenceInAString.strStrWithoutMethodsOfClassString("sadbutsad", "sad"));
        Assertions.assertEquals(-1, findTheIndexOfTheFirstOccurrenceInAString.strStrWithoutMethodsOfClassString("leetcode", "leeto"));
        Assertions.assertEquals(-1, findTheIndexOfTheFirstOccurrenceInAString.strStrWithoutMethodsOfClassString("aaa", "aaaa"));
        Assertions.assertEquals(4, findTheIndexOfTheFirstOccurrenceInAString.strStrWithoutMethodsOfClassString("mississippi", "issip"));
    }
}
