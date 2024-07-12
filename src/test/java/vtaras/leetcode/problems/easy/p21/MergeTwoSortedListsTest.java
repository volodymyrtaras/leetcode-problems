package vtaras.leetcode.problems.easy.p21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vtaras.leetcode.problems.easy.p21.MergeTwoSortedLists.ListNode;

class MergeTwoSortedListsTest {

    @Test
    void testMergeTwoLists() {
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode expectedList = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));

        Assertions.assertEquals(expectedList, mergeTwoSortedLists.mergeTwoLists(list1, list2));

        Assertions.assertNull(mergeTwoSortedLists.mergeTwoLists(null, null));

        list2 = new ListNode(0);
        expectedList = new ListNode(0);

        Assertions.assertEquals(expectedList, mergeTwoSortedLists.mergeTwoLists(null, list2));
    }
}
