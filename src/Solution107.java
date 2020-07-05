/**
 * @author Vamsi Krishna Govada on 5/26/2020.
 * @project LeetCode
 */


// Binary Tree Level Order Traversal II


import java.util.*;

public class Solution107 {

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

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> output = new ArrayList<>();
        if(root!=null)
            helper(root,output);
        return output;
    }

    public void helper(TreeNode root, List<List<Integer>> output){

        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);

        while(!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode temp = queue.peek();
                queue.remove();
                list.add(temp.val);
                if(temp.left!=null) queue.add(temp.left);
                if(temp.right!=null) queue.add(temp.right);
            }

            output.add(list);
        }
        Collections.reverse(output);
    }
}
