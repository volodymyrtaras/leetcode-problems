package vtaras.leetcode.problems.easy.p94;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/*
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 *
 * Example 1:
 *
 * Input: root = [1,null,2,3]
 * Output: [1,3,2]
 *
 * Example 2:
 *
 * Input: root = []
 * Output: []
 *
 * Example 3:
 *
 * Input: root = [1]
 * Output: [1]
 *
 * Constraints:
 *
 * The number of nodes in the tree is in the range [0, 100].
 * -100 <= Node.val <= 100
 *
 *
 * Follow up: Recursive solution is trivial, could you do it iteratively?
 */
public class BinaryTreeInorderTraversal {

    /*
        - create a LIFO collection (stack) to keep elements from the left part of tree
        - starting from the root, traverse tree using current node
        - until current node is not null or stack is not empty, traverse the tree
        - if current is not null, push element to stack and reassign current to the left
        - if current is null, get element from stack and add to the resulting list
        - assign current to the right to process right side of the node
     */
    public List<Integer> inorderTraversalIterative(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            result.add(current.val);
            current = current.right;
        }

        return result;
    }

    /*
        - create a list for values
        - create and call a method which simply checks if node is not null
        - if node is not null, pass left node to the same method, add current value to list and pass right node to the same method
    */
    public List<Integer> inorderTraversalWithRecursion(TreeNode root) {
        List<Integer> valueList = new ArrayList<>();

        addNodeValues(root, valueList);

        return valueList;
    }

    public void addNodeValues(TreeNode node, List<Integer> valueList) {
        if (node != null) {
            addNodeValues(node.left, valueList);
            valueList.add(node.val);
            addNodeValues(node.right, valueList);
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
