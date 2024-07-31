package vtaras.leetcode.problems.easy.p88;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MergeSortedArrayTest {

    private final MergeSortedArray mergeSortedArray = new MergeSortedArray();

    @Test
    void testMerge() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        mergeSortedArray.merge(nums1, m, nums2, n);

        Assertions.assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

    @Test
    void testMergeAndSecondArrayIsEmpty() {
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;

        mergeSortedArray.merge(nums1, m, nums2, n);

        Assertions.assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    void testMergeSingleElementsArrays() {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;

        mergeSortedArray.merge(nums1, m, nums2, n);

        Assertions.assertArrayEquals(new int[]{1}, nums1);
    }
}
