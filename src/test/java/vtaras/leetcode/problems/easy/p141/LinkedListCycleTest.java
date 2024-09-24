package vtaras.leetcode.problems.easy.p141;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LinkedListCycleTest {

    private final LinkedListCycle linkedListCycle = new LinkedListCycle();

    @Test
    void testCycleExists() {
        LinkedListCycle.ListNode node1 = new LinkedListCycle.ListNode(3);
        LinkedListCycle.ListNode node2 = new LinkedListCycle.ListNode(2);
        LinkedListCycle.ListNode node3 = new LinkedListCycle.ListNode(0);
        LinkedListCycle.ListNode node4 = new LinkedListCycle.ListNode(-4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        Assertions.assertTrue(linkedListCycle.hasCycle(node1));
    }

    @Test
    void testCycleAtHead() {
        LinkedListCycle.ListNode node1 = new LinkedListCycle.ListNode(1);
        LinkedListCycle.ListNode node2 = new LinkedListCycle.ListNode(2);

        node1.next = node2;
        node2.next = node1;

        Assertions.assertTrue(linkedListCycle.hasCycle(node1));
    }

    @Test
    void testNoCycle() {
        LinkedListCycle.ListNode node1 = new LinkedListCycle.ListNode(1);
        LinkedListCycle.ListNode node2 = new LinkedListCycle.ListNode(2);

        node1.next = node2;
        node2.next = null;

        Assertions.assertFalse(linkedListCycle.hasCycle(node1));
    }

    @Test
    void testSingleNodeNoCycle() {
        LinkedListCycle.ListNode node1 = new LinkedListCycle.ListNode(1);

        Assertions.assertFalse(linkedListCycle.hasCycle(node1));
    }

    @Test
    void testEmptyList() {
        Assertions.assertFalse(linkedListCycle.hasCycle(null));
    }

    @Test
    void testTwoNodesCycle() {
        LinkedListCycle.ListNode node1 = new LinkedListCycle.ListNode(1);
        LinkedListCycle.ListNode node2 = new LinkedListCycle.ListNode(2);

        node1.next = node2;
        node2.next = node1;

        Assertions.assertTrue(linkedListCycle.hasCycle(node1));
    }

    @Test
    void testTwoNodesNoCycle() {
        LinkedListCycle.ListNode node1 = new LinkedListCycle.ListNode(1);
        LinkedListCycle.ListNode node2 = new LinkedListCycle.ListNode(2);

        node1.next = node2;
        node2.next = null;

        Assertions.assertFalse(linkedListCycle.hasCycle(node1));
    }
}
