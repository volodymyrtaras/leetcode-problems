package thirteen;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanToIntegerSolutionTest {

    private RomanToIntegerSolution romanToIntegerSolution;

    @Before
    public void setUp() {
        romanToIntegerSolution = new RomanToIntegerSolution();
    }

    @Test
    public void testRomanToInt() {

        assertEquals(3, romanToIntegerSolution.romanToInt("III"));
        assertEquals(4, romanToIntegerSolution.romanToInt("IV"));
        assertEquals(9, romanToIntegerSolution.romanToInt("IX"));
        assertEquals(58, romanToIntegerSolution.romanToInt("LVIII"));
        assertEquals(1994, romanToIntegerSolution.romanToInt("MCMXCIV"));
    }
}
