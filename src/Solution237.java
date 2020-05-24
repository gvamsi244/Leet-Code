/**
 * @author Vamsi Krishna Govada on 5/24/2020.
 * @project LeetCode
 */

// Delete Node in a Linked List

public class Solution237 {

    // Definition for singly-linked list.
    // Comment this section in case if you need to submit as Solution in Leetcode
    public class ListNode {
        int val;
        Solution19.ListNode next;
        ListNode(int x) { val = x; }
    }

    public void deleteNode(ListNode node) {

        node.val = node.next.val;
        node.next = node.next.next;

    }
}
