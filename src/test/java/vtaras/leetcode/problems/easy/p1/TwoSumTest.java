package vtaras.leetcode.problems.easy.p1;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoSumTest {

    @Test
    void testTwoSum() {
        TwoSum twoSum = new TwoSum();

        executeAndVerifyResult(twoSum, new int[]{2, 7, 11, 15}, 9, List.of(0, 1));
        executeAndVerifyResult(twoSum, new int[]{3, 2, 4}, 6, List.of(1, 2));
        executeAndVerifyResult(twoSum, new int[]{3, 3}, 6, List.of(0, 1));
    }

    private void executeAndVerifyResult(TwoSum twoSum, int[] array, int target, List<Integer> expectedIndexesList) {
        int[] result = twoSum.twoSum(array, target);

        Assertions.assertEquals(2, result.length);

        boolean indexesArePresentInAnyOrder = (result[0] == expectedIndexesList.get(0) && result[1] == expectedIndexesList.get(1)) ||
            (result[0] == expectedIndexesList.get(1) && result[1] == expectedIndexesList.get(0));

        Assertions.assertTrue(indexesArePresentInAnyOrder);
    }
}
