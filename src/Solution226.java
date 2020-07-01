/**
 * @author Vamsi Krishna Govada on 7/1/2020.
 * @project LeetCode
 */


//  Invert Binary Tree


public class Solution226 {

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

    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            TreeNode temp = null;
            temp = root.right;
            root.right = root.left;
            root.left = temp;
            if (root.left != null) invertTree(root.left);
            if (root.right != null) invertTree(root.right);
            return root;
        }
        return null;
    }
}
