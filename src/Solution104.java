/**
 * @author Vamsi Krishna Govada on 5/26/2020.
 * @project LeetCode
 */

// Maximum Depth of Binary Tree


public class Solution104 {

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

    public int maxDepth(TreeNode root) {
        return depth(0, root);
    }

    public int depth(int max, TreeNode root) {

        if (root != null) {

            int max1 = depth(max + 1, root.left);
            int max2 = depth(max + 1, root.right);

            if (max1 > max2)
                return max1;
            else
                return max2;
        } else {
            return max;
        }
    }
}
