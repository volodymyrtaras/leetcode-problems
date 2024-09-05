package vtaras.leetcode.problems.easy.p118;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 *
 * Example 1:
 *
 * Input: numRows = 5
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 *
 * Example 2:
 *
 * Input: numRows = 1
 * Output: [[1]]
 *
 * Constraints:
 * 1 <= numRows <= 30
 */
public class PascalsTriangle {

    /*
        - create a variable to store all triangle and a variable to store previous row
        - iterate from 1 to n including, forming a rows
        - for each row add 1 to the left and 1 to the right position of the row
        - if there are still some remaining positions in the row, iterate over the previous row from 1 to c -1
        - sum previous - 1 and previous indexes numbers and set to the corresponding place
        - at the end add composed row to result
        - assign composed row as previous row
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rowsList = new ArrayList<>();

        int[] previousRow = new int[]{};
        for (int c = 1; c <= numRows; c++) {
            int[] currentRow = new int[c];

            currentRow[0] = 1;
            currentRow[c - 1] = 1;

            for (int p = 1; p < c - 1; p++) {
                currentRow[p] = previousRow[p - 1] + previousRow[p];
            }

            rowsList.add(
                Arrays
                    .stream(currentRow)
                    .boxed()
                    .toList()
            );

            previousRow = currentRow;
        }

        return rowsList;
    }
}
