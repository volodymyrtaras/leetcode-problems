package vtaras.leetcode.problems.medium.p55;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JumpGameTest {

    private final JumpGame jumpGame = new JumpGame();

    @Test
    void testCanJumpReachable() {
        Assertions.assertTrue(jumpGame.canJump(new int[]{2, 3, 1, 1, 4}));
    }

    @Test
    void testCanJumpUnreachable() {
        Assertions.assertFalse(jumpGame.canJump(new int[]{3, 2, 1, 0, 4}));
    }

    @Test
    void testSingleElement() {
        Assertions.assertTrue(jumpGame.canJump(new int[]{0}));
    }

    @Test
    void testAllZerosExceptFirst() {
        Assertions.assertFalse(jumpGame.canJump(new int[]{1, 0, 0, 0}));
    }

    @Test
    void testAllZeros() {
        Assertions.assertFalse(jumpGame.canJump(new int[]{0, 0, 0, 0}));
    }

    @Test
    void testMaxJumpAtEveryPosition() {
        Assertions.assertTrue(jumpGame.canJump(new int[]{10, 10, 10, 10}));
    }

    @Test
    void testLongArrayReachable() {
        Assertions.assertTrue(jumpGame.canJump(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }

    @Test
    void testLongArrayUnreachable() {
        Assertions.assertFalse(jumpGame.canJump(new int[]{1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1}));
    }
}
