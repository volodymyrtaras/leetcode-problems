package vtaras.leetcode.problems.easy.p119;

import java.util.ArrayList;
import java.util.List;

/*
 * Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 *
 * Example 1:
 *
 * Input: rowIndex = 3
 * Output: [1,3,3,1]
 *
 * Example 2:
 *
 * Input: rowIndex = 0
 * Output: [1]
 *
 * Example 3:
 *
 * Input: rowIndex = 1
 * Output: [1,1]
 *
 * Constraints:
 * 0 <= rowIndex <= 33
 */
@SuppressWarnings(value = "SpellCheckingInspection")
public class PascalsTriangleII {

    /*
        - create a variable to store latest row, add default 1 for the first row
        - if rowIndex is greater than 0, iterate from 1 to rowIndex included, calculating letest row
        - at the beginning of iteration save previous row
        - for each row add 1 to the left and 1 to the right position of the row
        - if there are still some remaining positions in the row, iterate over the previous row from 1 to i
        - sum numbers at j - 1 and j indexes and set to the corresponding place
        - return the latest composed row
    */
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>(rowIndex + 1);

        row.add(1);

        if (rowIndex > 0) {
            for (int i = 1; i <= rowIndex; i++) {
                List<Integer> previousRow = new ArrayList<>(row);

                row.set(0, 1);

                for (int j = 1; j < i; j++) {
                    row.set(j, previousRow.get(j) + previousRow.get(j - 1));
                }

                row.add(i, 1);
            }
        }

        return row;
    }
}
