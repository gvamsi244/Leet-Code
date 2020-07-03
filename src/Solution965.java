/**
 * @author Vamsi Krishna Govada on 7/3/2020.
 * @project LeetCode
 */


// Univalued Binary Tree
public class Solution965 {

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

    boolean isUnival = true;

    public boolean isUnivalTree(TreeNode root) {

        if (root == null)
            return true;
        else {
            helper(root, root.val);
            return isUnival;
        }
    }

    public void helper(TreeNode root, int val) {

        if (root != null) {
            if (root.val != val)
                isUnival = false;
            else {
                helper(root.left, val);
                helper(root.right, val);
            }
        }
    }
}
