package vtaras.leetcode.problems.easy.p111;

/*
 * Given a binary tree, find its minimum depth.
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 * Note: A leaf is a node with no children.
 *
 * Example 1:
 *
 * Input: root = [3,9,20,null,null,15,7]
 * Output: 2
 *
 * Example 2:
 *
 * Input: root = [2,null,3,null,4,null,5,null,6]
 * Output: 5
 *
 * Constraints:
 *
 * The number of nodes in the tree is in the range [0, 105].
 * -1000 <= Node.val <= 1000
 */
public class MinimumDepthOfBinaryTree {

    /*
        - if root node itself is null, return 0
        - in other case, pass root node to a recursive method
        - if node is null, assign max value of int, any other value will be less
        - if both node leaves are null, assign depth as 1 (include current)
        - if both exist - pass to the recursive method, calculate minimum and increment (include current)
    */
    public int minDepth(TreeNode root) {
        return root != null ?
            findMinDepth(root) :
            0;
    }

    private int findMinDepth(TreeNode node) {
        int depth;

        if (node == null) {
            depth = Integer.MAX_VALUE;
        } else if (node.left == null && node.right == null) {
            depth = 1;
        } else {
            int leftDepth = findMinDepth(node.left);
            int rightDepth = findMinDepth(node.right);

            depth = Math.min(leftDepth, rightDepth) + 1;
        }

        return depth;
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
