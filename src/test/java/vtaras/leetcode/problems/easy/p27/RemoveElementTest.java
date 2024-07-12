package vtaras.leetcode.problems.easy.p27;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveElementTest {

    @Test
    void testRemoveElement() {
        RemoveElement removeElement = new RemoveElement();

        int[] givenArray = new int[]{3, 2, 2, 3};
        int[] expectedArray = new int[]{2, 2, 2, 3};

        Assertions.assertEquals(2, removeElement.removeElement(givenArray, 3));
        Assertions.assertArrayEquals(expectedArray, givenArray);

        givenArray = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        expectedArray = new int[]{0, 1, 3, 0, 4, 0, 4, 2};

        Assertions.assertEquals(5, removeElement.removeElement(givenArray, 2));
        Assertions.assertArrayEquals(expectedArray, givenArray);
    }
}
