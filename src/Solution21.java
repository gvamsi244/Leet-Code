/**
 * @author Vamsi Krishna Govada on 5/24/2020.
 * @project LeetCode
 */

// Merge Two Sorted Lists


public class Solution21 {

    // Definition for singly-linked list.
    // Comment this section in case if you need to submit as Solution in Leetcode
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode l3 = new ListNode(0); // Adding dummy
        ListNode temp3 = l3;
        ListNode temp1 = l1;
        ListNode temp2 = l2;


        while ((temp1 != null) && (temp2 != null)) {

            ListNode temp = new ListNode(0);

            if (temp1.val > temp2.val) {
                temp.val = temp2.val;
                temp2 = temp2.next;
                temp3.next = temp;
                temp3 = temp3.next;
            } else if (temp1.val < temp2.val) {
                temp.val = temp1.val;
                temp1 = temp1.next;
                temp3.next = temp;
                temp3 = temp3.next;
            } else {
                ListNode temp_dummy = new ListNode(0);
                temp_dummy.val = temp2.val;
                temp.val = temp2.val;

                temp1 = temp1.next;
                temp2 = temp2.next;

                temp3.next = temp;
                temp3 = temp3.next;


                temp3.next = temp_dummy;
                temp3 = temp3.next;

            }

        }

        if (temp1 == null) {
            while (temp2 != null) {
                ListNode temp = new ListNode(0);

                temp.val = temp2.val;
                temp3.next = temp;

                temp3 = temp3.next;
                temp2 = temp2.next;
            }
        }

        if (temp2 == null) {
            while (temp1 != null) {
                ListNode temp = new ListNode(0);

                temp.val = temp1.val;
                temp3.next = temp;

                temp3 = temp3.next;
                temp1 = temp1.next;
            }
        }
        temp3.next = null;
        temp3 = l3;
        l3 = l3.next;
        temp3 = null;// Removing the dummy

        return l3;
    }
}
