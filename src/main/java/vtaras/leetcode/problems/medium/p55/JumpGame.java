package vtaras.leetcode.problems.medium.p55;

/*
 * You are given an integer array nums.
 * You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
 * Return true if you can reach the last index, or false otherwise.
 *
 * Example 1:
 *
 * Input: nums = [2,3,1,1,4]
 * Output: true
 * Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
 *
 * Example 2:
 *
 * Input: nums = [3,2,1,0,4]
 * Output: false
 * Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
 *
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * 0 <= nums[i] <= 105
 */
public class JumpGame {

    /*
        - use a greedy approach to check if it is possible to reach the last index
        - initialize a variable to track maxReach int
        - if index is bigger than maxReach, return false
        - at each index assign max of maxReach and i + nums[i] to maximize the index
        - if maxReach is bigger or equal than last index, return true
     */
    public boolean canJump(int[] nums) {
        boolean canJump = false;
        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                break;
            }

            maxReach = Math.max(maxReach, i + nums[i]);

            if (maxReach >= nums.length - 1) {
                canJump = true;

                break;
            }
        }

        return canJump;
    }
}
