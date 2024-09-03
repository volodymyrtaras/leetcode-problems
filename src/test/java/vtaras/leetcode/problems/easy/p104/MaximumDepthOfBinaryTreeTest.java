package vtaras.leetcode.problems.easy.p104;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaximumDepthOfBinaryTreeTest {

    private final MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();

    @Test
    void testExample1() {
        MaximumDepthOfBinaryTree.TreeNode root = new MaximumDepthOfBinaryTree.TreeNode(
            3,
            new MaximumDepthOfBinaryTree.TreeNode(9),
            new MaximumDepthOfBinaryTree.TreeNode(20,
                new MaximumDepthOfBinaryTree.TreeNode(15),
                new MaximumDepthOfBinaryTree.TreeNode(7)
            )
        );

        Assertions.assertEquals(3, maximumDepthOfBinaryTree.maxDepth(root));
    }

    @Test
    void testExample2() {
        MaximumDepthOfBinaryTree.TreeNode root = new MaximumDepthOfBinaryTree.TreeNode(
            1,
            null,
            new MaximumDepthOfBinaryTree.TreeNode(2)
        );

        Assertions.assertEquals(2, maximumDepthOfBinaryTree.maxDepth(root));
    }

    @Test
    void testEmptyTree() {
        Assertions.assertEquals(0, maximumDepthOfBinaryTree.maxDepth(null));
    }

    @Test
    void testSingleNode() {
        MaximumDepthOfBinaryTree.TreeNode root = new MaximumDepthOfBinaryTree.TreeNode(1);

        Assertions.assertEquals(1, maximumDepthOfBinaryTree.maxDepth(root));
    }

    @Test
    void testLeftSkewed() {
        MaximumDepthOfBinaryTree.TreeNode root = new MaximumDepthOfBinaryTree.TreeNode(
            1,
            new MaximumDepthOfBinaryTree.TreeNode(
                2,
                new MaximumDepthOfBinaryTree.TreeNode(3),
                null
            ),
            null
        );

        Assertions.assertEquals(3, maximumDepthOfBinaryTree.maxDepth(root));
    }

    @Test
    void testRightSkewed() {
        MaximumDepthOfBinaryTree.TreeNode root = new MaximumDepthOfBinaryTree.TreeNode(1,
            null,
            new MaximumDepthOfBinaryTree.TreeNode(
                2,
                null,
                new MaximumDepthOfBinaryTree.TreeNode(3)
            )
        );

        Assertions.assertEquals(3, maximumDepthOfBinaryTree.maxDepth(root));
    }
}
