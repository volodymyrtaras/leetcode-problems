package vtaras.leetcode.problems.easy.p101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SymmetricTreeTest {

    private final SymmetricTree symmetricTree = new SymmetricTree();

    @Test
    void testSymmetricTree() {
        SymmetricTree.TreeNode root = new SymmetricTree.TreeNode(1);

        root.left = new SymmetricTree.TreeNode(2);
        root.right = new SymmetricTree.TreeNode(2);
        root.left.left = new SymmetricTree.TreeNode(3);
        root.left.right = new SymmetricTree.TreeNode(4);
        root.right.left = new SymmetricTree.TreeNode(4);
        root.right.right = new SymmetricTree.TreeNode(3);

        Assertions.assertTrue(symmetricTree.isSymmetric(root));
    }

    @Test
    void testAsymmetricTree() {
        SymmetricTree.TreeNode root = new SymmetricTree.TreeNode(1);

        root.left = new SymmetricTree.TreeNode(2);
        root.right = new SymmetricTree.TreeNode(2);
        root.left.right = new SymmetricTree.TreeNode(3);
        root.right.right = new SymmetricTree.TreeNode(3);

        Assertions.assertFalse(symmetricTree.isSymmetric(root));
    }

    @Test
    void testSingleNode() {
        SymmetricTree.TreeNode root = new SymmetricTree.TreeNode(1);

        Assertions.assertTrue(symmetricTree.isSymmetric(root));
    }

    @Test
    void testEmptyTree() {
        Assertions.assertTrue(symmetricTree.isSymmetric(null));
    }

    @Test
    void testDifferentValueNodes() {
        SymmetricTree.TreeNode root = new SymmetricTree.TreeNode(1);

        root.left = new SymmetricTree.TreeNode(2);
        root.right = new SymmetricTree.TreeNode(3);

        Assertions.assertFalse(symmetricTree.isSymmetric(root));
    }
}
