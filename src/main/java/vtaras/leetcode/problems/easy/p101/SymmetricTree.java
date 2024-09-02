package vtaras.leetcode.problems.easy.p101;

/*
 * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 *
 * Example 1:
 *
 * Input: root = [1,2,2,3,4,4,3]
 * Output: true
 *
 * Example 2:
 *
 * Input: root = [1,2,2,null,3,null,3]
 * Output: false
 *
 * Constraints:
 *
 * The number of nodes in the tree is in the range [1, 1000].
 * -100 <= Node.val <= 100
 */
public class SymmetricTree {

    /*
     * Tree is symmetric if root is null, if leaves are null, if leaves have equal values in closer and farther parts or are null
     */
    public boolean isSymmetric(TreeNode root) {
        return root == null || (root.left == null && root.right == null) || areSymmetric(root.left, root.right);
    }

    private boolean areSymmetric(TreeNode left, TreeNode right) {
        boolean areSymmetric = false;

        if (left != null && right != null && left.val == right.val) {
            boolean closerPartSymmetric = (left.right == null && right.left == null) || areSymmetric(left.right, right.left);
            boolean fartherPartSymmetric = (left.left == null && right.right == null) || areSymmetric(left.left, right.right);

            areSymmetric = closerPartSymmetric && fartherPartSymmetric;
        }

        return areSymmetric;
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
