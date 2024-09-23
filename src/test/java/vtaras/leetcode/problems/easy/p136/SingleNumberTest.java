package vtaras.leetcode.problems.easy.p136;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SingleNumberTest {

    private final SingleNumber singleNumber = new SingleNumber();

    @Test
    void testSingleNumberWithSmallArray() {
        Assertions.assertEquals(1, singleNumber.singleNumber(new int[]{2, 2, 1}), "Single number should be 1");
    }

    @Test
    void testSingleNumberWithMultiplePairs() {
        Assertions.assertEquals(4, singleNumber.singleNumber(new int[]{4, 1, 2, 1, 2}), "Single number should be 4");
    }

    @Test
    void testSingleNumberWithOneElement() {
        Assertions.assertEquals(1, singleNumber.singleNumber(new int[]{1}), "Single number should be 1");
    }

    @Test
    void testSingleNumberWithNegativeNumbers() {
        Assertions.assertEquals(-2, singleNumber.singleNumber(new int[]{-1, -1, -2}), "Single number should be -2");
    }

    @Test
    void testSingleNumberWithMixedNumbers() {
        Assertions.assertEquals(99, singleNumber.singleNumber(new int[]{0, 1, 0, 1, 99}), "Single number should be 99");
    }

    @Test
    void testSingleNumberWithLargeInput() {
        int[] nums = new int[100000];

        for (int i = 0; i < 49999; i++) {
            nums[2 * i] = i;
            nums[2 * i + 1] = i;
        }

        nums[99998] = 99999;

        Assertions.assertEquals(99999, singleNumber.singleNumber(nums), "Single number should be 99999");
    }
}
