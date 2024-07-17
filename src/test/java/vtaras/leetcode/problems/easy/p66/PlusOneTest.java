package vtaras.leetcode.problems.easy.p66;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PlusOneTest {

    @Test
    void testPlusOne() {
        PlusOne plusOne = new PlusOne();

        Assertions.assertArrayEquals(new int[]{1, 2, 4}, plusOne.plusOne(new int[]{1, 2, 3}));
        Assertions.assertArrayEquals(new int[]{4, 3, 2, 2}, plusOne.plusOne(new int[]{4, 3, 2, 1}));
        Assertions.assertArrayEquals(new int[]{2, 0, 0}, plusOne.plusOne(new int[]{1, 9, 9}));
        Assertions.assertArrayEquals(new int[]{1, 0}, plusOne.plusOne(new int[]{9}));
    }
}
