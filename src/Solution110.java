/**
 * @author Vamsi Krishna Govada on 7/1/2020.
 * @project LeetCode
 */


// Balanced Binary Tree


public class Solution110 {


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

    boolean balance = true;

    public boolean isBalanced(TreeNode root) {

        if (root == null) return true;
        int temp = height(root);
        return balance;
    }

    public int height(TreeNode root) {

        if (root != null) {
            int max1 = 1 + height(root.left);
            int max2 = 1 + height(root.right);
            int val = Math.abs(max1 - max2);
            if (val >= 2) balance = false; // setting value for global variable
            if (max1 > max2) return max1;
            else return max2;
        }
        return 0;
    }
}
