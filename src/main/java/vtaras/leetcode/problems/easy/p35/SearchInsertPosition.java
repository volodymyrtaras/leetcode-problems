package vtaras.leetcode.problems.easy.p35;

/*
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * Example 1:
 *
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 *
 * Example 2:
 *
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 *
 * Example 3:
 *
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 *
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums contains distinct values sorted in ascending order.
 * -104 <= target <= 104
 */
public class SearchInsertPosition {

    /*
        - array is sorted so better to use binary search
        - maintain left and right indexes, derive middle and compare to the target
        - iterate until left index is not equal to right
        - if check matches, return middle
        - after check, reassign left and right indexes, adding or deducting 1 from the middle
        - by default return left index, returning decreased right one can become -1, which is incorrect position for inserting
     */
    public int searchInsert(int[] nums, int target) {
        int index = 0;

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                index = mid;

                break;
            } else if (nums[mid] < target) {
                left = mid + 1;

                index = left;
            } else {
                right = mid - 1;
            }
        }

        return index;
    }
}
