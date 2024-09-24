package vtaras.leetcode.problems.easy.p141;

/*
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer.
 * Internally, pos is used to denote the index of the node that tail's next pointer is connected to.
 * Note that pos is not passed as a parameter.
 * Return true if there is a cycle in the linked list.
 * Otherwise, return false.
 *
 * Example 1:
 *
 * Input: head = [3,2,0,-4], pos = 1
 * Output: true
 * Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
 *
 * Example 2:
 *
 * Input: head = [1,2], pos = 0
 * Output: true
 * Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
 *
 * Example 3:
 *
 * Input: head = [1], pos = -1
 * Output: false
 * Explanation: There is no cycle in the linked list.
 *
 * Constraints:
 *
 * The number of the nodes in the list is in the range [0, 104].
 * -105 <= Node.val <= 105
 * pos is -1 or a valid index in the linked-list.
 */
public class LinkedListCycle {

    /*
        - return false if list contains 0 or 1 elements
        - initialize 2 pointers - 1st which moves 1 step, 2nd which moves 2 steps
        - return false if fast pointer reaches the end
        - return true if nodes at both pointers match
     */
    public boolean hasCycle(ListNode head) {
        boolean hasCycle;

        if (head == null || head.next == null) {
            hasCycle = false;
        } else {
            ListNode slow = head;
            ListNode fast = head.next;

            hasCycle = true;

            while (slow != fast) {
                if (fast == null || fast.next == null) {
                    hasCycle = false;

                    break;
                }

                slow = slow.next;
                fast = fast.next.next;
            }
        }

        return hasCycle;
    }

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
