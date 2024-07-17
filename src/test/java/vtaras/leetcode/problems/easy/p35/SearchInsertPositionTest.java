package vtaras.leetcode.problems.easy.p35;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SearchInsertPositionTest {

    @Test
    void testSearchInsert() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

        Assertions.assertEquals(2, searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 5));
        Assertions.assertEquals(1, searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 2));
        Assertions.assertEquals(4, searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 7));
        Assertions.assertEquals(0, searchInsertPosition.searchInsert(new int[]{2, 3, 5, 6}, 1));
        Assertions.assertEquals(4, searchInsertPosition.searchInsert(new int[]{2, 3, 5, 6}, 9));
        Assertions.assertEquals(0, searchInsertPosition.searchInsert(new int[]{}, 1));
    }
}
