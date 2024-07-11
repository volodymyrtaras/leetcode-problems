package vtaras.leetcode.problems.easy.p1;

import java.util.HashMap;
import java.util.Map;

/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 *
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 *
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 *
 * Constraints:
 *
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * Only one valid answer exists.
 */
public class TwoSum {

    /*
        - create final array
        - create map to keep value -> index
        - iterate the array
        - if target - current element value is in map as key, and index is not current, break and return
        - else -> put value and index to map
    */
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> candidateValueToIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int desiredValue = target - nums[i];

            if (candidateValueToIndexMap.containsKey(desiredValue)) {
                int candidateIndex = candidateValueToIndexMap.get(desiredValue);

                // same element cannot be used twice
                if (candidateIndex != i) {
                    result[0] = candidateIndex;
                    result[1] = i;

                    break;
                }
            }

            candidateValueToIndexMap.put(nums[i], i);
        }

        return result;
    }
}
