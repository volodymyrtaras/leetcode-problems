package vtaras.leetcode.problems.medium.p134;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GasStationTest {

    private final GasStation gasStation = new GasStation();

    @Test
    void testExample1() {
        Assertions.assertEquals(3, gasStation.canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}));
    }

    @Test
    void testExample2() {
        Assertions.assertEquals(-1, gasStation.canCompleteCircuit(new int[]{2, 3, 4}, new int[]{3, 4, 3}));
    }

    @Test
    void testSingleStationWithEnoughGas() {
        Assertions.assertEquals(0, gasStation.canCompleteCircuit(new int[]{5}, new int[]{4}));
    }

    @Test
    void testSingleStationNotEnoughGas() {
        Assertions.assertEquals(-1, gasStation.canCompleteCircuit(new int[]{4}, new int[]{5}));
    }

    @Test
    void testCircuitCompletableWithSurplus() {
        Assertions.assertEquals(4, gasStation.canCompleteCircuit(new int[]{5, 1, 2, 3, 4}, new int[]{4, 4, 1, 5, 1}));
    }

    @Test
    void testNoSolutionPossible() {
        Assertions.assertEquals(-1, gasStation.canCompleteCircuit(new int[]{1, 1, 1, 1, 1}, new int[]{2, 2, 2, 2, 2}));
    }

    @Test
    void testAllStationsHaveEqualGasAndCost() {
        Assertions.assertEquals(0, gasStation.canCompleteCircuit(new int[]{2, 2, 2, 2}, new int[]{2, 2, 2, 2}));
    }

    @Test
    void testLargeValuesWithSolution() {
        Assertions.assertEquals(0, gasStation.canCompleteCircuit(new int[]{100, 200, 300, 400, 500}, new int[]{50, 150, 250, 350, 450}));
    }
}
