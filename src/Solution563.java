/**
 * @author Vamsi Krishna Govada on 7/3/2020.
 * @project LeetCode
 */


// Binary Tree Tilt

public class Solution563 {

    // Definition for a binary tree node
    // Comment this section in case if you need to submit as Solution in Leetcode
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    int output = 0;

    public int findTilt(TreeNode root) {
        sum(root);
        return output;
    }

    public int sum(TreeNode root) {
        if (root != null) {
            int left = sum(root.left);
            int right = sum(root.right);
            output = output + Math.abs(left - right);
            return root.val + left + right;
        } else
            return 0;
    }
}
