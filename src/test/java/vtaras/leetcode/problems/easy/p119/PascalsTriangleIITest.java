package vtaras.leetcode.problems.easy.p119;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PascalsTriangleIITest {

    private final PascalsTriangleII pascalsTriangleII = new PascalsTriangleII();

    @Test
    void testGetRowIndex0() {
        List<Integer> result = pascalsTriangleII.getRow(0);

        Assertions.assertEquals(List.of(1), result);
    }

    @Test
    void testGetRowIndex1() {
        List<Integer> result = pascalsTriangleII.getRow(1);

        Assertions.assertEquals(List.of(1, 1), result);
    }

    @Test
    void testGetRowIndex2() {
        List<Integer> result = pascalsTriangleII.getRow(2);

        Assertions.assertEquals(List.of(1, 2, 1), result);
    }

    @Test
    void testGetRowIndex3() {
        List<Integer> result = pascalsTriangleII.getRow(3);

        Assertions.assertEquals(List.of(1, 3, 3, 1), result);
    }

    @Test
    void testGetRowIndex4() {
        List<Integer> result = pascalsTriangleII.getRow(4);

        Assertions.assertEquals(List.of(1, 4, 6, 4, 1), result);
    }

    @Test
    void testGetRowIndex5() {
        List<Integer> result = pascalsTriangleII.getRow(5);

        Assertions.assertEquals(List.of(1, 5, 10, 10, 5, 1), result);
    }

    @Test
    void testGetRowIndex6() {
        List<Integer> result = pascalsTriangleII.getRow(6);

        Assertions.assertEquals(List.of(1, 6, 15, 20, 15, 6, 1), result);
    }

    @Test
    void testGetRowIndex33() {
        List<Integer> result = pascalsTriangleII.getRow(33);
        
        Assertions.assertEquals(34, result.size());
        Assertions.assertEquals(1, result.get(0));
        Assertions.assertEquals(1, result.get(33));
    }
}