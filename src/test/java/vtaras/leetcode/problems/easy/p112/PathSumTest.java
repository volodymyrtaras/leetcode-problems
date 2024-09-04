package vtaras.leetcode.problems.easy.p112;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PathSumTest {

    private final PathSum pathSum = new PathSum();

    @Test
    void testHasPathSumExample1() {
        PathSum.TreeNode node7 = new PathSum.TreeNode(7);
        PathSum.TreeNode node2 = new PathSum.TreeNode(2);
        PathSum.TreeNode node11 = new PathSum.TreeNode(11, node7, node2);
        PathSum.TreeNode node4Left = new PathSum.TreeNode(4, node11, null);
        PathSum.TreeNode node1 = new PathSum.TreeNode(1);
        PathSum.TreeNode node4Right = new PathSum.TreeNode(4, null, node1);
        PathSum.TreeNode node13 = new PathSum.TreeNode(13);
        PathSum.TreeNode node8 = new PathSum.TreeNode(8, node13, node4Right);
        PathSum.TreeNode root = new PathSum.TreeNode(5, node4Left, node8);

        Assertions.assertTrue(pathSum.hasPathSum(root, 22));
    }

    @Test
    void testHasPathSumExample2() {
        PathSum.TreeNode node2 = new PathSum.TreeNode(2);
        PathSum.TreeNode node3 = new PathSum.TreeNode(3);
        PathSum.TreeNode root = new PathSum.TreeNode(1, node2, node3);

        Assertions.assertFalse(pathSum.hasPathSum(root, 5));
    }

    @Test
    void testHasPathSumExample3() {
        Assertions.assertFalse(pathSum.hasPathSum(null, 0));
    }

    @Test
    void testHasPathSumSingleNodeTrue() {
        PathSum.TreeNode root = new PathSum.TreeNode(1);

        Assertions.assertTrue(pathSum.hasPathSum(root, 1));
    }

    @Test
    void testHasPathSumSingleNodeFalse() {
        PathSum.TreeNode root = new PathSum.TreeNode(1);

        Assertions.assertFalse(pathSum.hasPathSum(root, 2));
    }

    @Test
    void testHasPathSumComplexTree() {
        PathSum.TreeNode node1 = new PathSum.TreeNode(1);
        PathSum.TreeNode node2 = new PathSum.TreeNode(2, node1, null);
        PathSum.TreeNode node3 = new PathSum.TreeNode(3);
        PathSum.TreeNode node4 = new PathSum.TreeNode(4);
        PathSum.TreeNode node5 = new PathSum.TreeNode(5, node1, node2);
        PathSum.TreeNode node6 = new PathSum.TreeNode(6, node3, node4);
        PathSum.TreeNode root = new PathSum.TreeNode(7, node5, node6);

        // path: 7 -> 5 -> 2 -> 1
        Assertions.assertTrue(pathSum.hasPathSum(root, 15));
        // no valid path
        Assertions.assertFalse(pathSum.hasPathSum(root, 14));
    }

    @Test
    void testHasPathSumLeftSkewedTree() {
        PathSum.TreeNode node4 = new PathSum.TreeNode(4);
        PathSum.TreeNode node3 = new PathSum.TreeNode(3, node4, null);
        PathSum.TreeNode node2 = new PathSum.TreeNode(2, node3, null);
        PathSum.TreeNode root = new PathSum.TreeNode(1, node2, null);

        // path: 1 -> 2 -> 3 -> 4
        Assertions.assertTrue(pathSum.hasPathSum(root, 10));
    }

    @Test
    void testHasPathSumRightSkewedTree() {
        PathSum.TreeNode node4 = new PathSum.TreeNode(4);
        PathSum.TreeNode node3 = new PathSum.TreeNode(3, null, node4);
        PathSum.TreeNode node2 = new PathSum.TreeNode(2, null, node3);
        PathSum.TreeNode root = new PathSum.TreeNode(1, null, node2);

        // path: 1 -> 2 -> 3 -> 4
        Assertions.assertTrue(pathSum.hasPathSum(root, 10));
    }
}
