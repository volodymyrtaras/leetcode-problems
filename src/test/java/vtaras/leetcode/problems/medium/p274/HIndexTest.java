package vtaras.leetcode.problems.medium.p274;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HIndexTest {

    private final HIndex hIndex = new HIndex();

    @Test
    void testExample1() {
        Assertions.assertEquals(3, hIndex.hIndex(new int[]{3, 0, 6, 1, 5}));
    }

    @Test
    void testExample2() {
        Assertions.assertEquals(1, hIndex.hIndex(new int[]{1, 3, 1}));
    }

    @Test
    void testAllZeroCitations() {
        Assertions.assertEquals(0, hIndex.hIndex(new int[]{0, 0, 0, 0}));
    }

    @Test
    void testSinglePaper() {
        Assertions.assertEquals(1, hIndex.hIndex(new int[]{10}));
    }

    @Test
    void testIncreasingCitations() {
        Assertions.assertEquals(3, hIndex.hIndex(new int[]{0, 1, 3, 5, 6}));
    }

    @Test
    void testDecreasingCitations() {
        Assertions.assertEquals(4, hIndex.hIndex(new int[]{10, 8, 5, 4, 3}));
    }

    @Test
    void testEqualCitations() {
        Assertions.assertEquals(3, hIndex.hIndex(new int[]{3, 3, 3, 3, 3}));
    }

    @Test
    void testHighCitations() {
        Assertions.assertEquals(5, hIndex.hIndex(new int[]{100, 200, 300, 400, 500}));
    }

    @Test
    void testMixedCitations() {
        Assertions.assertEquals(5, hIndex.hIndex(new int[]{10, 3, 4, 5, 9, 1, 6, 2, 8, 7}));
    }
}
