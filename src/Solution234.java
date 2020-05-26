/**
 * @author Vamsi Krishna Govada on 5/25/2020.
 * @project LeetCode
 */

//  Palindrome Linked List


public class Solution234 {

    // Definition for singly-linked list.
    // Comment this section in case if you need to submit as Solution in Leetcode
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode reverse(ListNode tail, ListNode head) {
        if (head != null) {
            ListNode temp = head.next;
            head.next = tail;
            tail = head;
            return reverse(tail, temp);
        }
        return tail;
    }

    public boolean isPalindrome(ListNode head1) {

        if ((head1 == null) || (head1.next == null))
            return true;

        int len = 0;

        ListNode head2 = null;
        ListNode temp = head1;

        while (temp != null) {
            len++;
            temp = temp.next;
        }

        temp = head1;
        for (int i = 0; i < (len / 2) - 1; i++) {
            temp = temp.next;
        }

        head2 = temp.next;
        temp.next = null;

        if (len % 2 != 0) {
            temp = head2;
            head2 = head2.next;
            temp.next = null;
        }

        head2 = reverse(null, head2);
        ListNode temp1 = head1;
        ListNode temp2 = head2;
        while ((temp1 != null) && (temp2 != null)) {
            if (temp1.val == temp2.val) {
                temp1 = temp1.next;
                temp2 = temp2.next;
            } else
                return false;
        }

        return true;
    }
}
