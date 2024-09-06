package vtaras.leetcode.problems.easy.p118;

import java.util.ArrayList;
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
        - create a variable to store all triangle
        - if numRows is greater than 0, add first row and iterate from 1 to n including, forming a rows
        - for each row add 1 to the left and 1 to the right position of the row
        - if there are still some remaining positions in the row, iterate over the previous row from 1 to i
        - sum numbers at j - 1 and j indexes and set to the corresponding place
        - at the end add composed row to result
        - assign composed row as previous row
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows > 0) {
            triangle.add(new ArrayList<>());
            triangle
                .get(0)
                .add(1);

            for (int i = 1; i < numRows; i++) {
                List<Integer> row = new ArrayList<>();
                List<Integer> previousRow = triangle.get(i - 1);

                row.add(1);

                for (int j = 1; j < i; j++) {
                    row.add(previousRow.get(j - 1) + previousRow.get(j));
                }

                row.add(1);

                triangle.add(row);
            }
        }

        return triangle;
    }
}
