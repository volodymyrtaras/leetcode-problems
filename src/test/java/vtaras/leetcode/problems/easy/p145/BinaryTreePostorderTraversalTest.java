package vtaras.leetcode.problems.easy.p145;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinaryTreePostorderTraversalTest {

    private final BinaryTreePostorderTraversal binaryTreePostorderTraversal = new BinaryTreePostorderTraversal();

    @Test
    void testPostorderTraversalExample1() {
        BinaryTreePostorderTraversal.TreeNode root = new BinaryTreePostorderTraversal.TreeNode(1);
        root.right = new BinaryTreePostorderTraversal.TreeNode(2);
        root.right.left = new BinaryTreePostorderTraversal.TreeNode(3);

        List<Integer> result = binaryTreePostorderTraversal.postorderTraversal(root);

        Assertions.assertEquals(List.of(3, 2, 1), result);
    }

    @Test
    void testPostorderTraversalExample2() {
        BinaryTreePostorderTraversal.TreeNode root = new BinaryTreePostorderTraversal.TreeNode(1,
            new BinaryTreePostorderTraversal.TreeNode(2,
                new BinaryTreePostorderTraversal.TreeNode(4),
                new BinaryTreePostorderTraversal.TreeNode(5,
                    new BinaryTreePostorderTraversal.TreeNode(6),
                    new BinaryTreePostorderTraversal.TreeNode(7)
                )
            ),
            new BinaryTreePostorderTraversal.TreeNode(3,
                null,
                new BinaryTreePostorderTraversal.TreeNode(8,
                    new BinaryTreePostorderTraversal.TreeNode(9),
                    null
                )
            )
        );

        List<Integer> result = binaryTreePostorderTraversal.postorderTraversal(root);

        Assertions.assertEquals(List.of(4, 6, 7, 5, 2, 9, 8, 3, 1), result);
    }

    @Test
    void testPostorderTraversalExample3() {
        List<Integer> result = binaryTreePostorderTraversal.postorderTraversal(null);

        Assertions.assertEquals(List.of(), result);
    }

    @Test
    void testPostorderTraversalExample4() {
        List<Integer> result = binaryTreePostorderTraversal.postorderTraversal(new BinaryTreePostorderTraversal.TreeNode(1));

        Assertions.assertEquals(List.of(1), result);
    }
}
