package seven;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseIntegerSolutionTest {

    private ReverseIntegerSolution reverseIntegerSolution;

    @Before
    public void setup() {
        reverseIntegerSolution = new ReverseIntegerSolution();
    }

    @Test
    public void testReverse() {

        assertEquals(321, reverseIntegerSolution.reverseWithStringBuilder(123));
        assertEquals(-321, reverseIntegerSolution.reverseWithStringBuilder(-123));
        assertEquals(21, reverseIntegerSolution.reverseWithStringBuilder(120));
        assertEquals(0, reverseIntegerSolution.reverseWithStringBuilder(0));
        assertEquals(0, reverseIntegerSolution.reverseWithStringBuilder(1534236469));
        assertEquals(0, reverseIntegerSolution.reverseWithStringBuilder(-1534236469));
    }

    @Test
    public void testReverseWithStringBuilderAndMath() {

        assertEquals(321, reverseIntegerSolution.reverseWithStringBuilderAndMath(123));
        assertEquals(-321, reverseIntegerSolution.reverseWithStringBuilderAndMath(-123));
        assertEquals(21, reverseIntegerSolution.reverseWithStringBuilderAndMath(120));
        assertEquals(0, reverseIntegerSolution.reverseWithStringBuilderAndMath(0));
        assertEquals(0, reverseIntegerSolution.reverseWithStringBuilderAndMath(1534236469));
        assertEquals(0, reverseIntegerSolution.reverseWithStringBuilderAndMath(-1534236469));
    }

    @Test
    public void testReverseWithoutLibraryClasses() {

        assertEquals(321, reverseIntegerSolution.reverseWithoutLibraryClasses(123));
        assertEquals(-321, reverseIntegerSolution.reverseWithoutLibraryClasses(-123));
        assertEquals(21, reverseIntegerSolution.reverseWithoutLibraryClasses(120));
        assertEquals(0, reverseIntegerSolution.reverseWithoutLibraryClasses(0));
        assertEquals(0, reverseIntegerSolution.reverseWithoutLibraryClasses(1534236469));
        assertEquals(0, reverseIntegerSolution.reverseWithoutLibraryClasses(-1534236469));
    }
}
