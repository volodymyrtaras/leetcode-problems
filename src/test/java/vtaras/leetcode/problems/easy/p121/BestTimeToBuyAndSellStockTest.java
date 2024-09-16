package vtaras.leetcode.problems.easy.p121;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BestTimeToBuyAndSellStockTest {

    private final BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();

    @Test
    void testMaxProfitExample1() {
        Assertions.assertEquals(5, bestTimeToBuyAndSellStock.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    void testMaxProfitExample2() {
        Assertions.assertEquals(0, bestTimeToBuyAndSellStock.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    @Test
    void testMaxProfitNoProfit() {
        Assertions.assertEquals(0, bestTimeToBuyAndSellStock.maxProfit(new int[]{3, 3, 3, 3, 3}));
    }

    @Test
    void testMaxProfitSingleDay() {
        Assertions.assertEquals(0, bestTimeToBuyAndSellStock.maxProfit(new int[]{5}));
    }

    @Test
    void testMaxProfitIncreasingPrices() {
        Assertions.assertEquals(4, bestTimeToBuyAndSellStock.maxProfit(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void testMaxProfitDecreasingPrices() {
        Assertions.assertEquals(0, bestTimeToBuyAndSellStock.maxProfit(new int[]{5, 4, 3, 2, 1}));
    }
}
