package vtaras.leetcode.problems.easy.p83;

/*
 * Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
 * Return the linked list sorted as well.
 *
 * Example 1:
 *
 * Input: head = [1,1,2]
 * Output: [1,2]
 *
 * Example 2:
 *
 * Input: head = [1,1,2,3,3]
 * Output: [1,2,3]
 *
 * Constraints:
 *
 * The number of nodes in the list is in the range [0, 300].
 * -100 <= Node.val <= 100
 * The list is guaranteed to be sorted in ascending order.
 */
public class RemoveDuplicatesFromSortedList {

    /*
        - if head is not null, create a ListNode for current cursor and assign head to it
        - iterate until current.next exists
        - if current value is the same as next value, reassign next link to next.next
        - if other assign current cursor to the next element
     */
    public ListNode deleteDuplicates(ListNode head) {
        if (head != null) {
            ListNode current = head;

            while (current.next != null) {
                if (current.val == current.next.val) {
                    current.next = current.next.next;
                } else {
                    current = current.next;
                }
            }
        }

        return head;
    }

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}
