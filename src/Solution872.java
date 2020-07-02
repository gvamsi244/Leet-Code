/**
 * @author Vamsi Krishna Govada on 7/2/2020.
 * @project LeetCode
 */


//  Leaf-Similar Trees


import java.util.*;


public class Solution872 {

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

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if (leafSeq(root1).equals(leafSeq(root2)))
            return true;
        else
            return false;
    }

    public List<Integer> leafSeq(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        if (root == null)
            return output;
        else
            helper(root, output);
        return output;
    }

    public void helper(TreeNode root, List<Integer> output) {

        if (root != null) {
            if ((root.left == null) && (root.right == null))
                output.add(root.val);

            else {
                helper(root.left, output);
                helper(root.right, output);
            }

        }
    }
}

