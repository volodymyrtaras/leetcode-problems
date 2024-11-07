package vtaras.leetcode.problems.medium.p380;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InsertDeleteGetRandomO1Test {

    private InsertDeleteGetRandomO1.RandomizedSet randomizedSet;

    @BeforeEach
    void setUp() {
        randomizedSet = new InsertDeleteGetRandomO1.RandomizedSet();
    }

    @Test
    void testInsert() {
        Assertions.assertTrue(randomizedSet.insert(1));
        Assertions.assertFalse(randomizedSet.insert(1));
        Assertions.assertTrue(randomizedSet.insert(2));
    }

    @Test
    void testRemove() {
        randomizedSet.insert(1);
        randomizedSet.insert(2);

        Assertions.assertTrue(randomizedSet.remove(1));
        Assertions.assertFalse(randomizedSet.remove(1));
        Assertions.assertTrue(randomizedSet.remove(2));
        Assertions.assertFalse(randomizedSet.remove(3));
    }

    @Test
    void testGetRandom() {
        randomizedSet.insert(1);
        randomizedSet.insert(2);
        randomizedSet.insert(3);

        int randomValue = randomizedSet.getRandom();

        Assertions.assertTrue(randomValue == 1 || randomValue == 2 || randomValue == 3);

        boolean hasReturned1 = false;
        boolean hasReturned2 = false;
        boolean hasReturned3 = false;

        for (int i = 0; i < 100; i++) {
            int val = randomizedSet.getRandom();

            if (val == 1) {
                hasReturned1 = true;
            }

            if (val == 2) {
                hasReturned2 = true;
            }

            if (val == 3) {
                hasReturned3 = true;
            }
        }

        Assertions.assertTrue(hasReturned1 && hasReturned2 && hasReturned3);
    }

    @Test
    void testInsertRemoveGetRandomCombination() {
        Assertions.assertTrue(randomizedSet.insert(1));
        Assertions.assertTrue(randomizedSet.insert(2));
        Assertions.assertTrue(randomizedSet.remove(1));
        Assertions.assertFalse(randomizedSet.insert(2));
        Assertions.assertEquals(2, randomizedSet.getRandom());
        Assertions.assertTrue(randomizedSet.insert(3));

        int randomValue = randomizedSet.getRandom();

        Assertions.assertTrue(randomValue == 2 || randomValue == 3);
    }
}
