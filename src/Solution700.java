/**
 * @author Vamsi Krishna Govada on 6/29/2020.
 * @project LeetCode
 */

// Search in a Binary Search Tree

public class Solution700 {

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

    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode temp = null;
        if (root != null) {
            if (root.val == val)
                return root;
            else {
                temp = searchBST(root.left, val);
                if (temp != null)
                    return temp;
                else
                    return searchBST(root.right, val);
            }
        } else
            return null;
    }
}
