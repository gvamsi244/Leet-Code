/**
 * @author Vamsi Krishna Govada on 7/14/2020.
 * @project LeetCode
 */


// Min Stack


import java.util.*;


public class Solution155 {

    class MinStack {

        /** initialize your data structure here. */
        LinkedList<Integer> stack = new LinkedList<>();

        public MinStack() {

        }

        public void push(int x) {
            stack.add(x);
        }

        public void pop() {
            stack.pollLast();
        }

        public int top() {
            return stack.peekLast();
        }

        public int getMin() {
            Iterator<Integer> iterator = stack.iterator();
            int min=iterator.next();
            while (iterator.hasNext()){
                int temp = iterator.next();
                min = Math.min(temp,min);
            }
            return min;
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}
