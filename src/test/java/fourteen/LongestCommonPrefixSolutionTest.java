package fourteen;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestCommonPrefixSolutionTest {

    private LongestCommonPrefixSolution longestCommonPrefixSolution;

    @Before
    public void setUp() {
        longestCommonPrefixSolution = new LongestCommonPrefixSolution();
    }

    @Test
    public void testLongestCommonPrefix() {

        assertEquals("fl", longestCommonPrefixSolution
                .longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        assertEquals("", longestCommonPrefixSolution
                .longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        assertEquals("", longestCommonPrefixSolution
                .longestCommonPrefix(new String[]{"dog", "", "car"}));
        assertEquals("a", longestCommonPrefixSolution
                .longestCommonPrefix(new String[]{"ab", "a"}));
        assertEquals("Volod", longestCommonPrefixSolution
                .longestCommonPrefix(new String[]{"Volodymyr", "Volod", "Volodym"}));
        assertEquals("", longestCommonPrefixSolution
                .longestCommonPrefix(new String[]{}));
        assertEquals("adb", longestCommonPrefixSolution
                .longestCommonPrefix(new String[]{"adb"}));
    }

    @Test
    public void testLongestCommonPrefixWithHorizontalScanning() {

        assertEquals("fl", longestCommonPrefixSolution
                .longestCommonPrefixWithHorizontalScanning(new String[]{"flower", "flow", "flight"}));
        assertEquals("", longestCommonPrefixSolution
                .longestCommonPrefixWithHorizontalScanning(new String[]{"dog", "racecar", "car"}));
        assertEquals("", longestCommonPrefixSolution
                .longestCommonPrefixWithHorizontalScanning(new String[]{"dog", "", "car"}));
        assertEquals("a", longestCommonPrefixSolution
                .longestCommonPrefixWithHorizontalScanning(new String[]{"ab", "a"}));
        assertEquals("Volod", longestCommonPrefixSolution
                .longestCommonPrefixWithHorizontalScanning(new String[]{"Volodymyr", "Volod", "Volodym"}));
        assertEquals("", longestCommonPrefixSolution
                .longestCommonPrefixWithHorizontalScanning(new String[]{}));
        assertEquals("adb", longestCommonPrefixSolution
                .longestCommonPrefixWithHorizontalScanning(new String[]{"adb"}));
    }

    @Test
    public void testLongestCommonPrefixWithVerticalScanning() {

        assertEquals("fl", longestCommonPrefixSolution
                .longestCommonPrefixWithVerticalScanning(new String[]{"flower", "flow", "flight"}));
        assertEquals("", longestCommonPrefixSolution
                .longestCommonPrefixWithVerticalScanning(new String[]{"dog", "racecar", "car"}));
        assertEquals("", longestCommonPrefixSolution
                .longestCommonPrefixWithVerticalScanning(new String[]{"dog", "", "car"}));
        assertEquals("a", longestCommonPrefixSolution
                .longestCommonPrefixWithVerticalScanning(new String[]{"ab", "a"}));
        assertEquals("Volod", longestCommonPrefixSolution
                .longestCommonPrefixWithVerticalScanning(new String[]{"Volodymyr", "Volod", "Volodym"}));
        assertEquals("", longestCommonPrefixSolution
                .longestCommonPrefixWithVerticalScanning(new String[]{}));
        assertEquals("adb", longestCommonPrefixSolution
                .longestCommonPrefixWithVerticalScanning(new String[]{"adb"}));
    }

    @Test
    public void testLongestCommonPrefixDivideAndConquer() {

        assertEquals("fl", longestCommonPrefixSolution
                .longestCommonPrefixDivideAndConquer(new String[]{"flower", "flow", "flight"}));
        assertEquals("", longestCommonPrefixSolution
                .longestCommonPrefixDivideAndConquer(new String[]{"dog", "racecar", "car"}));
        assertEquals("", longestCommonPrefixSolution
                .longestCommonPrefixDivideAndConquer(new String[]{"dog", "", "car"}));
        assertEquals("a", longestCommonPrefixSolution
                .longestCommonPrefixDivideAndConquer(new String[]{"ab", "a"}));
        assertEquals("Volod", longestCommonPrefixSolution
                .longestCommonPrefixDivideAndConquer(new String[]{"Volodymyr", "Volod", "Volodym"}));
        assertEquals("", longestCommonPrefixSolution
                .longestCommonPrefixDivideAndConquer(new String[]{}));
        assertEquals("adb", longestCommonPrefixSolution
                .longestCommonPrefixDivideAndConquer(new String[]{"adb"}));
    }

    @Test
    public void testLongestCommonPrefixWithBinarySearch() {

        assertEquals("fl", longestCommonPrefixSolution
                .longestCommonPrefixWithBinarySearch(new String[]{"flower", "flow", "flight"}));
        assertEquals("", longestCommonPrefixSolution
                .longestCommonPrefixWithBinarySearch(new String[]{"dog", "racecar", "car"}));
        assertEquals("", longestCommonPrefixSolution
                .longestCommonPrefixWithBinarySearch(new String[]{"dog", "", "car"}));
        assertEquals("a", longestCommonPrefixSolution
                .longestCommonPrefixWithBinarySearch(new String[]{"ab", "a"}));
        assertEquals("Volod", longestCommonPrefixSolution
                .longestCommonPrefixWithBinarySearch(new String[]{"Volodymyr", "Volod", "Volodym"}));
        assertEquals("", longestCommonPrefixSolution
                .longestCommonPrefixWithBinarySearch(new String[]{}));
        assertEquals("adb", longestCommonPrefixSolution
                .longestCommonPrefixWithBinarySearch(new String[]{"adb"}));
    }
}
