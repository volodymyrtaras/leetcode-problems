package vtaras.leetcode.problems.medium.p45;

/*
 * You are given a 0-indexed array of integers nums of length n.
 * You are initially positioned at nums[0].
 * Each element nums[i] represents the maximum length of a forward jump from index i.
 * In other words, if you are at nums[i], you can jump to any nums[i + j] where:
 *
 * 0 <= j <= nums[i] and
 * i + j < n
 *
 * Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such that you can reach nums[n - 1].
 *
 * Example 1:
 *
 * Input: nums = [2,3,1,1,4]
 * Output: 2
 * Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
 *
 * Example 2:
 *
 * Input: nums = [2,3,0,1,4]
 * Output: 2
 *
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * 0 <= nums[i] <= 1000
 * It's guaranteed that you can reach nums[n - 1].
 */
public class JumpGameII {

    /*
        - use a greedy approach
        - initialize a variable to track number of jumps
        - initialize a variable to track maxReach int
        - initialize a variable to track currentMaxReach int
        - at each index assign max of maxReach and i + nums[i] to maximize the index
        - if index is equal to currentMaxReach, increase number of jumps, assign maxReach to currentMaxReach
        - if currentMaxReach is already equal or bigger than last index, break early
    */
    public int jump(int[] nums) {
        int jumps = 0;
        int currentMaxReach = 0;
        int maxReach = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            maxReach = Math.max(maxReach, i + nums[i]);

            if (i == currentMaxReach) {
                jumps++;
                currentMaxReach = maxReach;

                if (currentMaxReach >= nums.length - 1) {
                    break;
                }
            }
        }

        return jumps;
    }
}
