package vtaras.leetcode.problems.medium.p122;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BestTimeToBuyAndSellStockIITest {

    private final BestTimeToBuyAndSellStockII bestTimeToBuyAndSellStockII = new BestTimeToBuyAndSellStockII();

    @Test
    void testExample1() {
        Assertions.assertEquals(7, bestTimeToBuyAndSellStockII.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    void testExample2() {
        Assertions.assertEquals(4, bestTimeToBuyAndSellStockII.maxProfit(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void testExample3() {
        Assertions.assertEquals(0, bestTimeToBuyAndSellStockII.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    @Test
    void testSingleDay() {
        Assertions.assertEquals(0, bestTimeToBuyAndSellStockII.maxProfit(new int[]{5}));
    }

    @Test
    void testNoTransactionNeeded() {
        Assertions.assertEquals(0, bestTimeToBuyAndSellStockII.maxProfit(new int[]{3, 3, 3, 3, 3}));
    }

    @Test
    void testMultipleUpDownTrends() {
        Assertions.assertEquals(18, bestTimeToBuyAndSellStockII.maxProfit(new int[]{1, 7, 2, 8, 3, 9}));
    }

    @Test
    void testEmptyPrices() {
        Assertions.assertEquals(0, bestTimeToBuyAndSellStockII.maxProfit(new int[]{}));
    }
}
