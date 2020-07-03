/**
 * @author Vamsi Krishna Govada on 7/3/2020.
 * @project LeetCode
 */


// Symmetric Tree


public class Solution101 {

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

    public boolean isSymmetric(TreeNode root) {
        if (areIdentical(root, root) == 1)
            return true;
        else
            return false;

    }

    public int areIdentical(TreeNode root1, TreeNode root2) {
        if ((root1 == null) && (root2 == null))
            return 1;
        if ((root1 == null) || (root2 == null))
            return 0;
        else {
            if ((root1.val == root2.val) && (areIdentical(root1.left, root2.right) == 1) &&
                    (areIdentical(root1.right, root2.left) == 1))
                return 1;
            else return 0;
        }
    }
}
