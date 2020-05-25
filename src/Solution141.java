/**
 * @author Vamsi Krishna Govada on 5/24/2020.
 * @project LeetCode
 */

// Linked List Cycle


public class Solution141 {

    // Definition for singly-linked list.
    // Comment this section in case if you need to submit as Solution in Leetcode
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public boolean hasCycle(ListNode head) {

        if ((head == null) || (head.next == null))
            return false;
        ListNode temp1 = head;
        ListNode temp2 = head.next;

        while ((temp1 != null) && (temp2 != null) && (temp2.next != null)) {
            if (temp1 == temp2)
                return true;
            temp1 = temp1.next;
            temp2 = temp2.next;
            temp2 = temp2.next;
        }
        return false;
    }
}
