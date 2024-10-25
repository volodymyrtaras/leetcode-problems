package vtaras.leetcode.problems.medium.p189;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RotateArrayTest {

    private final RotateArray rotateArray = new RotateArray();

    @Test
    void testRotateByThree() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int[] expected = {5, 6, 7, 1, 2, 3, 4};

        rotateArray.rotate(nums, 3);

        Assertions.assertArrayEquals(expected, nums);
    }

    @Test
    void testRotateByTwo() {
        int[] nums = {-1, -100, 3, 99};
        int[] expected = {3, 99, -1, -100};

        rotateArray.rotate(nums, 2);

        Assertions.assertArrayEquals(expected, nums);
    }

    @Test
    void testRotateZeroSteps() {
        int[] nums = {1, 2, 3};
        int[] expected = {1, 2, 3};

        rotateArray.rotate(nums, 0);

        Assertions.assertArrayEquals(expected, nums);
    }

    @Test
    void testRotateEqualToLength() {
        int[] nums = {1, 2, 3};
        int[] expected = {1, 2, 3};

        rotateArray.rotate(nums, 3);

        Assertions.assertArrayEquals(expected, nums);
    }

    @Test
    void testRotateMoreThanLength() {
        int[] nums = {1, 2, 3};
        int[] expected = {3, 1, 2};

        rotateArray.rotate(nums, 4);

        Assertions.assertArrayEquals(expected, nums);
    }
}
