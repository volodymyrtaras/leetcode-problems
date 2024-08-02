package vtaras.leetcode.problems.easy.p108;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vtaras.leetcode.problems.easy.p108.ConvertSortedArrayToBinarySearchTree.TreeNode;

class ConvertSortedArrayToBinarySearchTreeTest {

    private final ConvertSortedArrayToBinarySearchTree convertSortedArrayToBinarySearchTree = new ConvertSortedArrayToBinarySearchTree();

    @Test
    void testSortedArrayToBST() {
        int[] nums1 = {-10, -3, 0, 5, 9};

        TreeNode node = convertSortedArrayToBinarySearchTree.sortedArrayToBST(nums1);

        Assertions.assertTrue(isValidBST(node));
        Assertions.assertTrue(isBalanced(node));
    }

    @Test
    void test2ElementsSortedArrayToBST() {
        int[] nums2 = {1, 3};

        TreeNode node = convertSortedArrayToBinarySearchTree.sortedArrayToBST(nums2);

        Assertions.assertTrue(isValidBST(node));
        Assertions.assertTrue(isBalanced(node));
    }

    @Test
    void testSingleElementSortedArrayToBST() {
        int[] nums4 = {1};

        TreeNode node = convertSortedArrayToBinarySearchTree.sortedArrayToBST(nums4);

        Assertions.assertNotNull(node);
        Assertions.assertEquals(1, node.val);
        Assertions.assertNull(node.left);
        Assertions.assertNull(node.right);
    }

    @Test
    void testEmptyArrayToBST() {
        int[] nums3 = {};

        TreeNode node = convertSortedArrayToBinarySearchTree.sortedArrayToBST(nums3);

        Assertions.assertNull(node);
    }

    private boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValidBST(TreeNode node, long min, long max) {
        boolean isValidBST;

        if (node == null) {
            isValidBST = true;
        } else if (node.val <= min || node.val >= max) {
            isValidBST = false;
        } else {
            isValidBST = isValidBST(node.left, min, node.val) && isValidBST(node.right, node.val, max);
        }

        return isValidBST;
    }

    private boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    private int checkHeight(TreeNode node) {
        int height;

        if (node == null) {
            height = 0;
        } else {
            int leftHeight = checkHeight(node.left);

            if (leftHeight == -1) {
                height = -1;
            } else {
                int rightHeight = checkHeight(node.right);

                if (rightHeight == -1) {
                    height = -1;
                } else {
                    if (Math.abs(leftHeight - rightHeight) > 1) {
                        height = -1;
                    } else {
                        height = Math.max(leftHeight, rightHeight) + 1;
                    }
                }
            }
        }

        return height;
    }
}
