package vtaras.leetcode.problems.easy.p111;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinimumDepthOfBinaryTreeTest {

    private final MinimumDepthOfBinaryTree minimumDepthOfBinaryTree = new MinimumDepthOfBinaryTree();

    @Test
    void testMinDepthExample1() {
        MinimumDepthOfBinaryTree.TreeNode node15 = new MinimumDepthOfBinaryTree.TreeNode(15);
        MinimumDepthOfBinaryTree.TreeNode node7 = new MinimumDepthOfBinaryTree.TreeNode(7);
        MinimumDepthOfBinaryTree.TreeNode node20 = new MinimumDepthOfBinaryTree.TreeNode(20, node15, node7);
        MinimumDepthOfBinaryTree.TreeNode node9 = new MinimumDepthOfBinaryTree.TreeNode(9);
        MinimumDepthOfBinaryTree.TreeNode root = new MinimumDepthOfBinaryTree.TreeNode(3, node9, node20);

        Assertions.assertEquals(2, minimumDepthOfBinaryTree.minDepth(root));
    }

    @Test
    void testMinDepthExample2() {
        MinimumDepthOfBinaryTree.TreeNode node6 = new MinimumDepthOfBinaryTree.TreeNode(6);
        MinimumDepthOfBinaryTree.TreeNode node5 = new MinimumDepthOfBinaryTree.TreeNode(5, null, node6);
        MinimumDepthOfBinaryTree.TreeNode node4 = new MinimumDepthOfBinaryTree.TreeNode(4, null, node5);
        MinimumDepthOfBinaryTree.TreeNode node3 = new MinimumDepthOfBinaryTree.TreeNode(3, null, node4);
        MinimumDepthOfBinaryTree.TreeNode root = new MinimumDepthOfBinaryTree.TreeNode(2, null, node3);

        Assertions.assertEquals(5, minimumDepthOfBinaryTree.minDepth(root));
    }

    @Test
    void testMinDepthWithNullRoot() {
        Assertions.assertEquals(0, minimumDepthOfBinaryTree.minDepth(null));
    }

    @Test
    void testMinDepthWithSingleNode() {
        MinimumDepthOfBinaryTree.TreeNode root = new MinimumDepthOfBinaryTree.TreeNode(1);

        Assertions.assertEquals(1, minimumDepthOfBinaryTree.minDepth(root));
    }

    @Test
    void testMinDepthWithTwoLevelTree() {
        MinimumDepthOfBinaryTree.TreeNode node2 = new MinimumDepthOfBinaryTree.TreeNode(2);
        MinimumDepthOfBinaryTree.TreeNode root = new MinimumDepthOfBinaryTree.TreeNode(1, node2, null);

        Assertions.assertEquals(2, minimumDepthOfBinaryTree.minDepth(root));
    }
}
