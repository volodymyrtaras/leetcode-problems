package vtaras.leetcode.problems.easy.p70;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ClimbingStairsTest {

    @Test
    void testClimbStairs() {
        ClimbingStairs climbingStairs = new ClimbingStairs();

        Assertions.assertEquals(2, climbingStairs.climbStairs(2));
        Assertions.assertEquals(3, climbingStairs.climbStairs(3));
    }
}
