package vtaras.leetcode.problems.easy.p118;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PascalsTriangleTest {

    private final PascalsTriangle pascalsTriangle = new PascalsTriangle();

    @Test
    void testGenerateExample1() {
        List<List<Integer>> expected = List.of(
            List.of(1),
            List.of(1, 1),
            List.of(1, 2, 1),
            List.of(1, 3, 3, 1),
            List.of(1, 4, 6, 4, 1)
        );

        List<List<Integer>> result = pascalsTriangle.generate(5);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void testGenerateExample2() {
        List<List<Integer>> expected = List.of(List.of(1));

        List<List<Integer>> result = pascalsTriangle.generate(1);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void testGenerateNumRows3() {
        List<List<Integer>> expected = List.of(
            List.of(1),
            List.of(1, 1),
            List.of(1, 2, 1)
        );

        List<List<Integer>> result = pascalsTriangle.generate(3);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void testGenerateNumRows0() {
        List<List<Integer>> result = pascalsTriangle.generate(0);

        // an empty list should be returned for 0 rows
        Assertions.assertEquals(new ArrayList<>(), result);
    }

    @Test
    void testGenerateEdgeCaseNumRows30() {
        // only checking that the size is correct for numRows = 30
        List<List<Integer>> result = pascalsTriangle.generate(30);

        Assertions.assertEquals(30, result.size());
    }

    @Test
    void testGenerateNumRows2() {
        List<List<Integer>> expected = List.of(
            List.of(1),
            List.of(1, 1)
        );

        List<List<Integer>> result = pascalsTriangle.generate(2);

        Assertions.assertEquals(expected, result);
    }
}
