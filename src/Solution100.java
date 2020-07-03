/**
 * @author Vamsi Krishna Govada on 7/2/2020.
 * @project LeetCode
 */


// Same Tree


public class Solution100 {

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

    public boolean isSameTree(TreeNode root1, TreeNode root2) {
        if ((root1 == null) && (root2 == null))
            return true;
        if ((root1 == null) || (root2 == null))
            return false;
        else {
            if ((root1.val == root2.val) && (isSameTree(root1.left, root2.left)) && (isSameTree(root1.right, root2.right)))
                return true;
            else
                return false;
        }

    }
}
