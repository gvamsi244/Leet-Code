/**
 * @author Vamsi Krishna Govada on 7/2/2020.
 * @project LeetCode
 */


// N-ary Tree Preorder Traversal


import java.util.ArrayList;
import java.util.List;


public class Solution589 {

    // Definition for a Node
    // Comment this section (class Node) in case if you need to submit as Solution in Leetcode
    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<Integer> preorder(Node root) {
        List<Integer> output = new ArrayList<>();
        if (root == null)
            return output;
        else
            helper(root, output);
        return output;
    }

    public void helper(Node root, List<Integer> output) {
        int size = root.children.size();
        output.add(root.val);
        for (int i = 0; i < size; i++)
            helper(root.children.get(i), output);
    }
}
