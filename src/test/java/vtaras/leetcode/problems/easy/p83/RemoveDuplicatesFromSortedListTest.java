package vtaras.leetcode.problems.easy.p83;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveDuplicatesFromSortedListTest {

    private final RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList();

    @Test
    void testDeleteDuplicatesExample1() {
        RemoveDuplicatesFromSortedList.ListNode head = new RemoveDuplicatesFromSortedList.ListNode(1);
        head.next = new RemoveDuplicatesFromSortedList.ListNode(1);
        head.next.next = new RemoveDuplicatesFromSortedList.ListNode(2);

        RemoveDuplicatesFromSortedList.ListNode result = removeDuplicatesFromSortedList.deleteDuplicates(head);

        Assertions.assertArrayEquals(new int[]{1, 2}, toArray(result));
    }

    @Test
    void testDeleteDuplicatesExample2() {
        RemoveDuplicatesFromSortedList.ListNode head = new RemoveDuplicatesFromSortedList.ListNode(1);
        head.next = new RemoveDuplicatesFromSortedList.ListNode(1);
        head.next.next = new RemoveDuplicatesFromSortedList.ListNode(2);
        head.next.next.next = new RemoveDuplicatesFromSortedList.ListNode(3);
        head.next.next.next.next = new RemoveDuplicatesFromSortedList.ListNode(3);

        RemoveDuplicatesFromSortedList.ListNode result = removeDuplicatesFromSortedList.deleteDuplicates(head);

        Assertions.assertArrayEquals(new int[]{1, 2, 3}, toArray(result));
    }

    @Test
    void testDeleteDuplicatesEmptyList() {
        RemoveDuplicatesFromSortedList.ListNode result = removeDuplicatesFromSortedList.deleteDuplicates(null);

        Assertions.assertArrayEquals(new int[]{}, toArray(result));
    }

    @Test
    void testDeleteDuplicatesNoDuplicates() {
        RemoveDuplicatesFromSortedList.ListNode head = new RemoveDuplicatesFromSortedList.ListNode(1);
        head.next = new RemoveDuplicatesFromSortedList.ListNode(2);
        head.next.next = new RemoveDuplicatesFromSortedList.ListNode(3);

        RemoveDuplicatesFromSortedList.ListNode result = removeDuplicatesFromSortedList.deleteDuplicates(head);

        Assertions.assertArrayEquals(new int[]{1, 2, 3}, toArray(result));
    }

    @Test
    void testDeleteDuplicatesAllDuplicates() {
        RemoveDuplicatesFromSortedList.ListNode head = new RemoveDuplicatesFromSortedList.ListNode(1);
        head.next = new RemoveDuplicatesFromSortedList.ListNode(1);
        head.next.next = new RemoveDuplicatesFromSortedList.ListNode(1);
        head.next.next.next = new RemoveDuplicatesFromSortedList.ListNode(1);

        RemoveDuplicatesFromSortedList.ListNode result = removeDuplicatesFromSortedList.deleteDuplicates(head);

        Assertions.assertArrayEquals(new int[]{1}, toArray(result));
    }

    private int[] toArray(RemoveDuplicatesFromSortedList.ListNode head) {
        int[] result = new int[300];
        int index = 0;

        while (head != null) {
            result[index++] = head.val;
            head = head.next;
        }

        int[] finalResult = new int[index];

        System.arraycopy(result, 0, finalResult, 0, index);

        return finalResult;
    }
}
