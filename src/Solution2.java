/**
 * @author Vamsi Krishna Govada on 6/1/2020.
 * @project LeetCode
 */

// Add Two Numbers


public class Solution2 {

    // Definition for singly-linked list.
    // Comment this section in case if you need to submit as Solution in Leetcode
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode output = null;
        ListNode head = null;
        ListNode temp = null;
        int result = 0, carry = 0, val1 = 0, val2 = 0, val3 = 0;
        while ((l1 != null) || (l2 != null)) {
            if (l1 == null)
                val1 = 0;
            else
                val1 = l1.val;
            if (l2 == null)
                val2 = 0;
            else
                val2 = l2.val;

            val3 = val1 + val2 + carry;

            if (val3 >= 10) {
                result = val3 % 10;
                carry = 1;
            } else {
                result = val3;
                carry = 0;
            }

            if (head == null) {
                output = new ListNode(result);
                output.next = null;
                head = output;
                temp = output;
            } else {
                temp = new ListNode(result);
                output.next = temp;
                output = temp;
                output.next = null;
                //   System.out.println(output.val);
            }
            if ((l1 == null) || (l2 == null)) {
                if (l1 == null)
                    l2 = l2.next;
                else
                    l1 = l1.next;
            } else {
                l1 = l1.next;
                l2 = l2.next;
            }
        }
        if (carry == 1) {
            temp = new ListNode(1);
            output.next = temp;
            output = temp;
            output.next = null;
        }
        return head;
    }
}
