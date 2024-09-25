package vtaras.leetcode.problems.easy.p144;

import java.util.ArrayList;
import java.util.List;

/*
 * Given the root of a binary tree, return the preorder traversal of its nodes' values.
 *
 * Example 1:
 *
 * Input: root = [1,null,2,3]
 * Output: [1,2,3]
 *
 * Example 2:
 *
 * Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]
 * Output: [1,2,4,5,6,7,3,8,9]
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
 * The number of nodes in the tree is in the range [0, 100]. -100 <= Node.val <= 100
 */
public class BinaryTreePreorderTraversal {

    /*
        - we need to add all values of the tree in the traversal order
        - initialize list of values, traverse the tree with recursion and return this list
    */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> valueList = new ArrayList<>();

        traverseAndAddValues(valueList, root);

        return valueList;
    }

    private void traverseAndAddValues(List<Integer> valueList, TreeNode node) {
        if (node != null) {
            valueList.add(node.val);

            traverseAndAddValues(valueList, node.left);
            traverseAndAddValues(valueList, node.right);
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
