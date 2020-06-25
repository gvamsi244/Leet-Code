/**
 * @author Vamsi Krishna Govada on 6/25/2020.
 * @project LeetCode
 */

// Count Complete Tree Nodes

public class Solution222 {

    // Definition for a binary tree node
    // Comment this section in case if you need to submit as Solution in Leetcode
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int countNodes(TreeNode root) {
        if(root!=null)
            return 1 + countNodes(root.left) + countNodes(root.right);
        else
            return 0;
    }
}
