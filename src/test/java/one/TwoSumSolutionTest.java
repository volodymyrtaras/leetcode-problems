package one;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumSolutionTest {

    private TwoSumSolution twoSumSolution;

    @Before
    public void setup() {
        twoSumSolution = new TwoSumSolution();
    }

    @Test
    public void testTwoSumWithoutMap() {

        assertArrayEquals(new int[]{0, 1}, twoSumSolution.twoSumWithoutMap(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{1, 2}, twoSumSolution.twoSumWithoutMap(new int[]{3, 2, 4}, 6));
        assertArrayEquals(new int[]{0, 1}, twoSumSolution.twoSumWithoutMap(new int[]{3, 3}, 6));
        assertArrayEquals(new int[]{0, 2}, twoSumSolution.twoSumWithoutMap(new int[]{3, 2, 3}, 6));
    }

    @Test
    public void testTwoSumOnePassMap() {

        assertArrayEquals(new int[]{0, 1}, twoSumSolution.twoSumOnePassMap(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{1, 2}, twoSumSolution.twoSumOnePassMap(new int[]{3, 2, 4}, 6));
        assertArrayEquals(new int[]{0, 1}, twoSumSolution.twoSumOnePassMap(new int[]{3, 3}, 6));
        assertArrayEquals(new int[]{0, 2}, twoSumSolution.twoSumOnePassMap(new int[]{3, 2, 3}, 6));
    }

    @Test
    public void testTwoSumTwoPassMap() {

        assertArrayEquals(new int[]{0, 1}, twoSumSolution.twoSumTwoPassMap(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{1, 2}, twoSumSolution.twoSumTwoPassMap(new int[]{3, 2, 4}, 6));
        assertArrayEquals(new int[]{0, 1}, twoSumSolution.twoSumTwoPassMap(new int[]{3, 3}, 6));
        assertArrayEquals(new int[]{0, 2}, twoSumSolution.twoSumTwoPassMap(new int[]{3, 2, 3}, 6));
    }
}
