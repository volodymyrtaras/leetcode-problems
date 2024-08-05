package vtaras.leetcode.problems.easy.p110;

/*
 * Given a binary tree, determine if it is height-balanced.
 *
 * Example 1:
 *
 * Input: root = [3,9,20,null,null,15,7]
 * Output: true
 *
 * Example 2:
 *
 * Input: root = [1,2,2,3,3,null,null,4,4]
 * Output: false
 *
 * Example 3:
 *
 * Input: root = []
 * Output: true
 *
 * Constraints:
 *
 * The number of nodes in the tree is in the range [0, 5000].
 * -104 <= Node.val <= 104
 */
public class BalancedBinaryTree {

    /*
        - create a recursive method to get height of a node as int
        - return 0, if the node is null
        - return -1, if left or right height is -1 (it means the difference between left and right height is more than 1)
        - obviously, return -1, if left and right height difference is more than 1
        - if no, return max of left and right height
    */
    public boolean isBalanced(TreeNode root) {
        return getHeight(root) != -1;
    }

    private int getHeight(TreeNode node) {
        int height;

        if (node == null) {
            height = 0;
        } else {
            int leftHeight = getHeight(node.left);

            if (leftHeight == -1) {
                height = -1;
            } else {
                int rightHeight = getHeight(node.right);

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

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
