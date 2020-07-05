/**
 * @author Vamsi Krishna Govada on 7/5/2020.
 * @project LeetCode
 */


// Average of Levels in Binary Tree


import java.util.*;

public class Solution637 {


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

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> output = new ArrayList<>();
        if (root != null)
            helper(root, output);
        return output;

    }

    public void helper(TreeNode root, List<Double> output) {


        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        int count = 0;
        double val = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.peek();
                queue.remove();
                val = val + temp.val;
                count++;
                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
            }
            System.out.println("val =" + val);
            System.out.println("count" + count);
            output.add(val / count);
            count = 0;
            val = 0;
        }
    }
}
