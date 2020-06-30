/**
 * @author Vamsi Krishna Govada on 6/30/2020.
 * @project LeetCode
 */


// Cousins in Binary Tree


public class Solution993 {


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


    public boolean isCousins(TreeNode root, int x, int y) {

        int arr_x[] = level(root, x, 0, 0);
        int arr_y[] = level(root, y, 0, 0);

        if (arr_x[1] == arr_y[1]) {
            if (arr_x[0] == arr_y[0])
                return false;
            else
                return true;
        }
        return false;
    }

    private int[] level(TreeNode root, int val, int parent, int height) {
        if (root != null) {
            if (root.val == val)
                return new int[]{parent, height};
            else {
                height = height + 1;
                int[] temp = level(root.left, val, root.val, height);
                if (temp != null)
                    return temp;
                else
                    return level(root.right, val, root.val, height);
            }
        } else
            return null;
    }
}
