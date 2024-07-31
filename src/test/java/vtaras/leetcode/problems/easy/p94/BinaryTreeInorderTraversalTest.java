package vtaras.leetcode.problems.easy.p94;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import vtaras.leetcode.problems.easy.p94.BinaryTreeInorderTraversal.TreeNode;

class BinaryTreeInorderTraversalTest {

    private final BinaryTreeInorderTraversal binaryTreeInorderTraversal = new BinaryTreeInorderTraversal();

    @Nested
    class Iterative {

        @Test
        void testInorderTraversal() {
            TreeNode node3 = new TreeNode(3);
            TreeNode node2 = new TreeNode(2, node3, null);
            TreeNode root = new TreeNode(1, null, node2);

            List<Integer> result = binaryTreeInorderTraversal.inorderTraversalIterative(root);
            List<Integer> expected = List.of(1, 3, 2);

            Assertions.assertEquals(expected, result);
        }

        @Test
        void testInorderTraversalRootNodeIsNull() {
            List<Integer> result = binaryTreeInorderTraversal.inorderTraversalIterative(null);
            List<Integer> expected = new ArrayList<>();

            Assertions.assertEquals(expected, result);
        }

        @Test
        void testInorderTraversalRootNodeIsSingle() {
            TreeNode root = new TreeNode(1);

            List<Integer> result = binaryTreeInorderTraversal.inorderTraversalIterative(root);
            List<Integer> expected = List.of(1);

            Assertions.assertEquals(expected, result);
        }

        @Test
        void testInorderTraversalRootNodeHasBothLeaves() {
            TreeNode node1 = new TreeNode(1);
            TreeNode node3 = new TreeNode(3);
            TreeNode root = new TreeNode(2, node1, node3);

            List<Integer> result = binaryTreeInorderTraversal.inorderTraversalIterative(root);
            List<Integer> expected = List.of(1, 2, 3);

            Assertions.assertEquals(expected, result);
        }

        @Test
        void testInorderTraversalAllNodesExist() {
            TreeNode node4 = new TreeNode(4);
            TreeNode node5 = new TreeNode(5);
            TreeNode node2 = new TreeNode(2, node4, node5);
            TreeNode node3 = new TreeNode(3);
            TreeNode root = new TreeNode(1, node2, node3);

            List<Integer> result = binaryTreeInorderTraversal.inorderTraversalIterative(root);
            List<Integer> expected = List.of(4, 2, 5, 1, 3);

            Assertions.assertEquals(expected, result);
        }
    }

    @Nested
    class Recursion {

        @Test
        void testInorderTraversal() {
            TreeNode node3 = new TreeNode(3);
            TreeNode node2 = new TreeNode(2, node3, null);
            TreeNode root = new TreeNode(1, null, node2);

            List<Integer> result = binaryTreeInorderTraversal.inorderTraversalWithRecursion(root);
            List<Integer> expected = List.of(1, 3, 2);

            Assertions.assertEquals(expected, result);
        }

        @Test
        void testInorderTraversalRootNodeIsNull() {
            List<Integer> result = binaryTreeInorderTraversal.inorderTraversalWithRecursion(null);
            List<Integer> expected = new ArrayList<>();

            Assertions.assertEquals(expected, result);
        }

        @Test
        void testInorderTraversalRootNodeIsSingle() {
            TreeNode root = new TreeNode(1);

            List<Integer> result = binaryTreeInorderTraversal.inorderTraversalWithRecursion(root);
            List<Integer> expected = List.of(1);

            Assertions.assertEquals(expected, result);
        }

        @Test
        void testInorderTraversalRootNodeHasBothLeaves() {
            TreeNode node1 = new TreeNode(1);
            TreeNode node3 = new TreeNode(3);
            TreeNode root = new TreeNode(2, node1, node3);

            List<Integer> result = binaryTreeInorderTraversal.inorderTraversalWithRecursion(root);
            List<Integer> expected = List.of(1, 2, 3);

            Assertions.assertEquals(expected, result);
        }

        @Test
        void testInorderTraversalAllNodesExist() {
            TreeNode node4 = new TreeNode(4);
            TreeNode node5 = new TreeNode(5);
            TreeNode node2 = new TreeNode(2, node4, node5);
            TreeNode node3 = new TreeNode(3);
            TreeNode root = new TreeNode(1, node2, node3);

            List<Integer> result = binaryTreeInorderTraversal.inorderTraversalWithRecursion(root);
            List<Integer> expected = List.of(4, 2, 5, 1, 3);

            Assertions.assertEquals(expected, result);
        }
    }
}
