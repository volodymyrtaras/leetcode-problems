package vtaras.leetcode.problems.easy.p100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SameTreeTest {

    private final SameTree sameTree = new SameTree();

    @Test
    void testIsSameTreeExample1() {
        SameTree.TreeNode node3a = new SameTree.TreeNode(3);
        SameTree.TreeNode node2a = new SameTree.TreeNode(2);
        SameTree.TreeNode rootA = new SameTree.TreeNode(1, node2a, node3a);

        SameTree.TreeNode node3b = new SameTree.TreeNode(3);
        SameTree.TreeNode node2b = new SameTree.TreeNode(2);
        SameTree.TreeNode rootB = new SameTree.TreeNode(1, node2b, node3b);

        Assertions.assertTrue(sameTree.isSameTree(rootA, rootB));
    }

    @Test
    void testIsSameTreeExample2() {
        SameTree.TreeNode node2 = new SameTree.TreeNode(2);
        SameTree.TreeNode rootA = new SameTree.TreeNode(1, node2, null);

        SameTree.TreeNode node2b = new SameTree.TreeNode(2);
        SameTree.TreeNode rootB = new SameTree.TreeNode(1, null, node2b);

        Assertions.assertFalse(sameTree.isSameTree(rootA, rootB));
    }

    @Test
    void testIsSameTreeExample3() {
        SameTree.TreeNode node2a = new SameTree.TreeNode(2);
        SameTree.TreeNode node1a = new SameTree.TreeNode(1);
        SameTree.TreeNode rootA = new SameTree.TreeNode(1, node2a, node1a);

        SameTree.TreeNode node2b = new SameTree.TreeNode(2);
        SameTree.TreeNode node1b = new SameTree.TreeNode(1);
        SameTree.TreeNode rootB = new SameTree.TreeNode(1, node1b, node2b);

        Assertions.assertFalse(sameTree.isSameTree(rootA, rootB));
    }

    @Test
    void testIsSameTreeAndSingleNodeEqual() {
        SameTree.TreeNode rootA = new SameTree.TreeNode(1);
        SameTree.TreeNode rootB = new SameTree.TreeNode(1);

        Assertions.assertTrue(sameTree.isSameTree(rootA, rootB));
    }

    @Test
    void testIsSameTreeAndSingleNodesAreDifferent() {
        SameTree.TreeNode rootA = new SameTree.TreeNode(1);
        SameTree.TreeNode rootB = new SameTree.TreeNode(2);

        Assertions.assertFalse(sameTree.isSameTree(rootA, rootB));
    }

    @Test
    void testIsSameTreeAndBothNodesAreNull() {
        Assertions.assertTrue(sameTree.isSameTree(null, null));
    }

    @Test
    void testIsSameTreeAndOneNodeIsNull() {
        SameTree.TreeNode rootA = new SameTree.TreeNode(1);

        Assertions.assertFalse(sameTree.isSameTree(rootA, null));
    }
}
