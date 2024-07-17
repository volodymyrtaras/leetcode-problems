package vtaras.leetcode.problems.easy.p58;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LengthOfLastWordTest {

    @Test
    @SuppressWarnings(value = "SpellCheckingInspection")
    void testLengthOfLastWord() {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();

        Assertions.assertEquals(5, lengthOfLastWord.lengthOfLastWord("Hello World"));
        Assertions.assertEquals(4, lengthOfLastWord.lengthOfLastWord("   fly me   to   the moon  "));
        Assertions.assertEquals(6, lengthOfLastWord.lengthOfLastWord("luffy is still joyboy"));
    }
}
