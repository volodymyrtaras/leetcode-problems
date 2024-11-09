package vtaras.leetcode.problems.medium.p238;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProductOfArrayExceptSelfTest {

    private final ProductOfArrayExceptSelf solution = new ProductOfArrayExceptSelf();

    @Test
    void testExample1() {
        Assertions.assertArrayEquals(
            new int[]{24, 12, 8, 6},
            solution.productExceptSelf(new int[]{1, 2, 3, 4})
        );
    }

    @Test
    void testExample2() {
        Assertions.assertArrayEquals(
            new int[]{0, 0, 9, 0, 0},
            solution.productExceptSelf(new int[]{-1, 1, 0, -3, 3})
        );
    }

    @Test
    void testAllOnes() {
        Assertions.assertArrayEquals(
            new int[]{1, 1, 1, 1},
            solution.productExceptSelf(new int[]{1, 1, 1, 1})
        );
    }

    @Test
    void testSingleZero() {
        Assertions.assertArrayEquals(
            new int[]{0, 0, 8, 0},
            solution.productExceptSelf(new int[]{1, 2, 0, 4})
        );
    }

    @Test
    void testAllNegatives() {
        Assertions.assertArrayEquals(
            new int[]{-24, -12, -8, -6},
            solution.productExceptSelf(new int[]{-1, -2, -3, -4})
        );
    }

    @Test
    void testTwoElements() {
        Assertions.assertArrayEquals(
            new int[]{3, 2},
            solution.productExceptSelf(new int[]{2, 3})
        );
    }
}
