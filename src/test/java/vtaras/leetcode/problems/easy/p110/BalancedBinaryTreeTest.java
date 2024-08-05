package vtaras.leetcode.problems.easy.p110;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BalancedBinaryTreeTest {

    private final BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();

    @Test
    void testIsBalancedNullTree() {
        Assertions.assertTrue(balancedBinaryTree.isBalanced(null), "An empty tree should be balanced");
    }

    @Test
    void testIsBalancedSingleNode() {
        BalancedBinaryTree.TreeNode root = new BalancedBinaryTree.TreeNode(1);

        Assertions.assertTrue(balancedBinaryTree.isBalanced(root));
    }

    @Test
    void testIsBalancedBalancedTree() {
        BalancedBinaryTree.TreeNode leftChild = new BalancedBinaryTree.TreeNode(2);
        BalancedBinaryTree.TreeNode rightChild = new BalancedBinaryTree.TreeNode(3);
        BalancedBinaryTree.TreeNode root = new BalancedBinaryTree.TreeNode(1, leftChild, rightChild);

        Assertions.assertTrue(balancedBinaryTree.isBalanced(root));
    }

    @Test
    void testIsBalancedUnbalancedTree() {
        BalancedBinaryTree.TreeNode leftChild = new BalancedBinaryTree.TreeNode(2);
        leftChild.left = new BalancedBinaryTree.TreeNode(3);
        BalancedBinaryTree.TreeNode root = new BalancedBinaryTree.TreeNode(1, leftChild, null);

        Assertions.assertFalse(balancedBinaryTree.isBalanced(root));
    }

    @Test
    void testIsBalancedComplexBalancedTree() {
        BalancedBinaryTree.TreeNode leftLeftChild = new BalancedBinaryTree.TreeNode(4);
        BalancedBinaryTree.TreeNode leftRightChild = new BalancedBinaryTree.TreeNode(5);
        BalancedBinaryTree.TreeNode rightLeftChild = new BalancedBinaryTree.TreeNode(6);
        BalancedBinaryTree.TreeNode rightRightChild = new BalancedBinaryTree.TreeNode(7);
        BalancedBinaryTree.TreeNode leftChild = new BalancedBinaryTree.TreeNode(2, leftLeftChild, leftRightChild);
        BalancedBinaryTree.TreeNode rightChild = new BalancedBinaryTree.TreeNode(3, rightLeftChild, rightRightChild);
        BalancedBinaryTree.TreeNode root = new BalancedBinaryTree.TreeNode(1, leftChild, rightChild);

        Assertions.assertTrue(balancedBinaryTree.isBalanced(root));
    }

    @Test
    void testIsBalancedComplexUnbalancedTree() {
        BalancedBinaryTree.TreeNode leftLeftLeftChild = new BalancedBinaryTree.TreeNode(8);
        BalancedBinaryTree.TreeNode leftLeftChild = new BalancedBinaryTree.TreeNode(4, leftLeftLeftChild, null);
        BalancedBinaryTree.TreeNode leftRightChild = new BalancedBinaryTree.TreeNode(5);
        BalancedBinaryTree.TreeNode leftChild = new BalancedBinaryTree.TreeNode(2, leftLeftChild, leftRightChild);
        BalancedBinaryTree.TreeNode rightChild = new BalancedBinaryTree.TreeNode(3);
        BalancedBinaryTree.TreeNode root = new BalancedBinaryTree.TreeNode(1, leftChild, rightChild);

        Assertions.assertFalse(balancedBinaryTree.isBalanced(root));
    }
}
