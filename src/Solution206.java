/**
 * @author Vamsi Krishna Govada on 5/25/2020.
 * @project LeetCode
 */

// Reverse Linked List


public class Solution206 {

    // Definition for singly-linked list.
    // Comment this section in case if you need to submit as Solution in Leetcode
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode reverseList(ListNode head) {

        if ((head == null) || (head.next == null))
            return head;

        ListNode temp1 = head;
        ListNode temp2 = head.next;
        ListNode temp3 = head.next;
        if (temp2.next != null)
            temp3 = temp2.next;

        while (true) {
            temp2.next = temp1;
            temp1 = temp2;
            temp2 = temp3;
            if (temp3.next != null)
                temp3 = temp3.next;

            if (temp1 == temp2) {
                head.next = null;
                return temp1;
            }
        }
    }


    // Solution 2: In Recursion
    /*
      public ListNode reverseList(ListNode head) {
        return reverse(null, head);
    }

    public ListNode reverse(ListNode tail, ListNode head) {
        if(head!=null){
            ListNode temp = head.next;
            head.next=tail;
            tail=head;
            return reverse(tail,temp);
        }
        return tail;
    }
     */
}
