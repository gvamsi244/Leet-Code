/**
 * @author Vamsi Krishna Govada on 7/3/2020.
 * @project LeetCode
 */


// Subtree of Another Tree


public class Solution572 {


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


    public boolean isSubtree(TreeNode s, TreeNode t) {

        if (match(s, t) == 1)
            return true;
        else
            return false;
    }

    public int match(TreeNode root1, TreeNode root2) {

        if (root1 == null)
            return 0;
        if (areIdentical(root1, root2))
            return 1;
        else {
            int temp = match(root1.left, root2);
            if (temp != 0)
                return temp;
            else
                return match(root1.right, root2);
        }


    }

    public boolean areIdentical(TreeNode root1, TreeNode root2) {
        if ((root1 == null) && (root2 == null))
            return true;
        if ((root1 == null) || (root2 == null))
            return false;
        else {
            if ((root1.val == root2.val) && (areIdentical(root1.left, root2.left)) && (areIdentical(root1.right, root2.right)))
                return true;
            else return false;
        }
    }
}
