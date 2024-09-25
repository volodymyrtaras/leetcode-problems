package vtaras.leetcode.problems.easy.p144;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinaryTreePreorderTraversalTest {

    private final BinaryTreePreorderTraversal binaryTreePreorderTraversal = new BinaryTreePreorderTraversal();

    @Test
    void testPreorderTraversalExample1() {
        BinaryTreePreorderTraversal.TreeNode root = new BinaryTreePreorderTraversal.TreeNode(1);
        root.right = new BinaryTreePreorderTraversal.TreeNode(2);
        root.right.left = new BinaryTreePreorderTraversal.TreeNode(3);

        List<Integer> result = binaryTreePreorderTraversal.preorderTraversal(root);

        Assertions.assertEquals(List.of(1, 2, 3), result);
    }

    @Test
    void testPreorderTraversalExample2() {
        BinaryTreePreorderTraversal.TreeNode root = new BinaryTreePreorderTraversal.TreeNode(1,
            new BinaryTreePreorderTraversal.TreeNode(2,
                new BinaryTreePreorderTraversal.TreeNode(4),
                new BinaryTreePreorderTraversal.TreeNode(5,
                    new BinaryTreePreorderTraversal.TreeNode(6),
                    new BinaryTreePreorderTraversal.TreeNode(7)
                )
            ),
            new BinaryTreePreorderTraversal.TreeNode(3,
                null,
                new BinaryTreePreorderTraversal.TreeNode(8,
                    new BinaryTreePreorderTraversal.TreeNode(9),
                    null
                )
            )
        );

        List<Integer> result = binaryTreePreorderTraversal.preorderTraversal(root);

        Assertions.assertEquals(List.of(1, 2, 4, 5, 6, 7, 3, 8, 9), result);
    }

    @Test
    void testPreorderTraversalExample3() {
        List<Integer> result = binaryTreePreorderTraversal.preorderTraversal(null);

        Assertions.assertEquals(List.of(), result);
    }

    @Test
    void testPreorderTraversalExample4() {
        BinaryTreePreorderTraversal.TreeNode root = new BinaryTreePreorderTraversal.TreeNode(1);

        List<Integer> result = binaryTreePreorderTraversal.preorderTraversal(root);

        Assertions.assertEquals(List.of(1), result);
    }
}
