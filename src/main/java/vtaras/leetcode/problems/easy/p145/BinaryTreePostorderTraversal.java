package vtaras.leetcode.problems.easy.p145;

import java.util.ArrayList;
import java.util.List;

/*
 * Given the root of a binary tree, return the postorder traversal of its nodes' values.
 *
 * Example 1:
 *
 * Input: root = [1,null,2,3]
 * Output: [3,2,1]
 *
 * Example 2:
 *
 * Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]
 * Output: [4,6,7,5,2,9,8,3,1]
 *
 * Example 3:
 *
 * Input: root = []
 * Output: []
 *
 * Example 4:
 *
 * Input: root = [1]
 * Output: [1]
 *
 * Constraints:
 *
 * The number of the nodes in the tree is in the range [0, 100].
 * -100 <= Node.val <= 100
 */
public class BinaryTreePostorderTraversal {

    /*
        - we need to add all values of the tree in the opposite traversal order
        - initialize list of values, traverse the tree with recursion and return this list
    */
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> valueList = new ArrayList<>();

        traverseAndAddValues(valueList, root);

        return valueList;
    }

    private void traverseAndAddValues(List<Integer> valueList, TreeNode node) {
        if (node != null) {
            traverseAndAddValues(valueList, node.left);
            traverseAndAddValues(valueList, node.right);

            valueList.add(node.val);
        }
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
