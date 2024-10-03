package vtaras.leetcode.problems.medium.p80;


import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveDuplicatesFromSortedArrayIITest {

    private final RemoveDuplicatesFromSortedArrayII removeDuplicatesFromSortedArrayII = new RemoveDuplicatesFromSortedArrayII();

    @Test
    void testExample1() {
        int[] nums = {1, 1, 1, 2, 2, 3};

        int k = removeDuplicatesFromSortedArrayII.removeDuplicates(nums);

        Assertions.assertEquals(5, k);
        Assertions.assertEquals(List.of(1, 1, 2, 2, 3), List.of(nums[0], nums[1], nums[2], nums[3], nums[4]));
    }

    @Test
    void testExample2() {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};

        int k = removeDuplicatesFromSortedArrayII.removeDuplicates(nums);

        Assertions.assertEquals(7, k);
        Assertions.assertEquals(List.of(0, 0, 1, 1, 2, 3, 3), List.of(nums[0], nums[1], nums[2], nums[3], nums[4], nums[5], nums[6]));
    }

    @Test
    void testAllUnique() {
        int[] nums = {1, 2, 3, 4, 5};

        int k = removeDuplicatesFromSortedArrayII.removeDuplicates(nums);

        Assertions.assertEquals(5, k);
        Assertions.assertEquals(List.of(1, 2, 3, 4, 5), List.of(nums[0], nums[1], nums[2], nums[3], nums[4]));
    }

    @Test
    void testAllSame() {
        int[] nums = {1, 1, 1, 1, 1};

        int k = removeDuplicatesFromSortedArrayII.removeDuplicates(nums);

        Assertions.assertEquals(2, k);
        Assertions.assertEquals(List.of(1, 1), List.of(nums[0], nums[1]));
    }

    @Test
    void testMixedNumbers() {
        int[] nums = {1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 5, 5};

        int k = removeDuplicatesFromSortedArrayII.removeDuplicates(nums);

        Assertions.assertEquals(10, k);
        Assertions.assertEquals(List.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5), List.of(nums[0], nums[1], nums[2], nums[3], nums[4], nums[5], nums[6], nums[7], nums[8], nums[9]));
    }
}
