package vtaras.leetcode.problems.easy.p108;

/*
 * Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.
 *
 * Example 1:
 *
 * Input: nums = [-10,-3,0,5,9]
 * Output: [0,-3,9,-10,null,5]
 * Explanation: [0,-10,5,null,-3,null,9] is also accepted:
 *
 * Example 2:
 *
 * Input: nums = [1,3]
 * Output: [3,1]
 * Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.
 *
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums is sorted in a strictly increasing order.
 */
public class ConvertSortedArrayToBinarySearchTree {

    /*
        - if array is null or empty, return null
        - if no, create a recursive method which accepts array, left and right indexes
        - if left is not bigger than right, calculate middle and create TreeNode with its value
        - assign left reference as this recursive method, passing decrementing middle as right
        - assign right reference as this recursive method, passing incrementing middle as left
        - return node at the end of the method
    */
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode node = null;

        if (nums != null && nums.length > 0) {
            node = constructTree(nums, 0, nums.length - 1);
        }

        return node;
    }

    private TreeNode constructTree(int[] nums, int left, int right) {
        TreeNode node = null;

        if (left <= right) {
            int middle = left + (right - left) / 2;
            node = new TreeNode(nums[middle]);
            node.left = constructTree(nums, left, middle - 1);
            node.right = constructTree(nums, middle + 1, right);
        }

        return node;
    }

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}
