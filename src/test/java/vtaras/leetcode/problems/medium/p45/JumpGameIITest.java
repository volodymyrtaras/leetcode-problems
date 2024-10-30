package vtaras.leetcode.problems.medium.p45;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JumpGameIITest {

    private final JumpGameII jumpGameII = new JumpGameII();

    @Test
    void testExampleCases() {
        Assertions.assertEquals(2, jumpGameII.jump(new int[]{2, 3, 1, 1, 4}));
        Assertions.assertEquals(2, jumpGameII.jump(new int[]{2, 3, 0, 1, 4}));
    }

    @Test
    void testEdgeCases() {
        Assertions.assertEquals(0, jumpGameII.jump(new int[]{0}));
        Assertions.assertEquals(1, jumpGameII.jump(new int[]{1, 0}));
    }

    @Test
    void testLargeJumps() {
        Assertions.assertEquals(1, jumpGameII.jump(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}));
    }

    @Test
    void testArrayWithZerosInBetween() {
        Assertions.assertEquals(3, jumpGameII.jump(new int[]{1, 2, 3, 0, 4}));
    }

    @Test
    void testLongArray() {
        int[] nums = new int[1000];

        for (int i = 0; i < 999; i++) {
            nums[i] = 1;
        }

        nums[999] = 0;

        Assertions.assertEquals(999, jumpGameII.jump(nums));
    }
}