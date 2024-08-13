package vtaras.leetcode.problems.easy.p100;

import java.util.Objects;

/*
 * Given the roots of two binary trees p and q, write a function to check if they are the same or not.
 * Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
 *
 * Example 1:
 *
 * Input: p = [1,2,3], q = [1,2,3]
 * Output: true
 *
 * Example 2:
 *
 * Input: p = [1,2], q = [1,null,2]
 * Output: false
 *
 * Example 3:
 *
 * Input: p = [1,2,1], q = [1,1,2]
 * Output: false
 *
 * Constraints:
 *
 * The number of nodes in both trees is in the range [0, 100].
 * -104 <= Node.val <= 104
 */
public class SameTree {

    /*
        - this method should have recursive design
        - two nodes are equal if both are null
        - two nodes are equal if they have the same values and left and right leaves are also equal
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean isSameTree = false;

        if (p == null && q == null) {
            isSameTree = true;
        } else if (p != null && q != null) {
            isSameTree = Objects.equals(p.val, q.val) &&
                isSameTree(p.left, q.left) &&
                isSameTree(p.right, q.right);
        }

        return isSameTree;
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
