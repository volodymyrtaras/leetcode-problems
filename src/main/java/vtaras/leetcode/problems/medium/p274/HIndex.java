package vtaras.leetcode.problems.medium.p274;

import java.util.Arrays;

/*
 * Given an array of integers citations where citations[i] is the number of citations a researcher received for their ith paper, return the researcher's h-index.
 * According to the definition of h-index on Wikipedia: The h-index is defined as the maximum value of h such that the given researcher has published at least h papers that have each been cited at least h times.
 *
 * Example 1:
 *
 * Input: citations = [3,0,6,1,5]
 * Output: 3
 * Explanation: [3,0,6,1,5] means the researcher has 5 papers in total and each of them had received 3, 0, 6, 1, 5 citations respectively.
 * Since the researcher has 3 papers with at least 3 citations each and the remaining two with no more than 3 citations each, their h-index is 3.
 *
 * Example 2:
 *
 * Input: citations = [1,3,1]
 * Output: 1
 *
 * Constraints:
 *
 * n == citations.length
 * 1 <= n <= 5000
 * 0 <= citations[i] <= 1000
 */
public class HIndex {

    /*
        - sort citations array in ascending order
        - iterate over each citation
        - (length - index) will be the number of papers with at least this citation count
        - index will be a citation count
        - if citation count is greater or equal to (length - index), then (length - index) is the h-index
    */
    public int hIndex(int[] citations) {
        Arrays.sort(citations);

        int n = citations.length;
        int hIndex = 0;

        for (int i = 0; i < n; i++) {
            int citationCount = citations[i];
            int papersWithAtLeastH = n - i;

            if (citationCount >= papersWithAtLeastH) {
                hIndex = papersWithAtLeastH;

                break;
            }
        }

        return hIndex;
    }
}
