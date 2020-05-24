/**
 * @author Vamsi Krishna Govada on 5/24/2020.
 * @project LeetCode
 */

// Remove Nth Node From End of List


public class Solution19 {


    // Definition for singly-linked list.
    // Comment this section in case if you need to submit as Solution in Leetcode
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }


    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode temp = head;
        int len = 0;

        if ((head == null) || (n == 0))
            return head;

        while (temp != null) {
            temp = temp.next;
            len++;
        }

        len = (len - 1) - n;
        temp = head;

        if (len < 0) {
            temp = temp.next;
            head = null;
            head = temp;
            return head;
        } else
            for (int i = 0; i < len; i++)
                temp = temp.next;

        ListNode temp1 = temp.next;
        if (temp1.next == null) { // Last element
            temp.next = null;
        } else { // Not Last Element
            temp.next = temp1.next;
            temp1 = null;
        }
        return head;
    }
}
