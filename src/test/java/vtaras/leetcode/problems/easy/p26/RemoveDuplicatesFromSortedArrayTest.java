package vtaras.leetcode.problems.easy.p26;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveDuplicatesFromSortedArrayTest {

    @Test
    void removeDuplicates() {
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();

        int[] givenArray = new int[]{1, 1, 2};
        int[] expectedArray = new int[]{1, 2, 2};

        Assertions.assertEquals(2, removeDuplicatesFromSortedArray.removeDuplicates(givenArray));
        Assertions.assertArrayEquals(expectedArray, givenArray);

        givenArray = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        expectedArray = new int[]{0, 1, 2, 3, 4, 2, 2, 3, 3, 4};

        Assertions.assertEquals(5, removeDuplicatesFromSortedArray.removeDuplicates(givenArray));
        Assertions.assertArrayEquals(expectedArray, givenArray);
    }
}
