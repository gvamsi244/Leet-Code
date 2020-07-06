/**
 * @author Vamsi Krishna Govada on 7/6/2020.
 * @project LeetCode
 */


// Valid Parentheses


import java.util.Stack;


public class Solution20 {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        int len = s.length();
        for (int i = 0; i < len; i++) {
            Character c = s.charAt(i);

            if ((c == '(') || (c == '[') || (c == '{')) {
                stack.push(c);
            } else {
                if (stack.isEmpty())
                    return false;
                if ((c == ')') && (stack.peek() != '('))
                    return false;
                if ((c == '}') && (stack.peek() != '{'))
                    return false;
                if ((c == ']') && (stack.peek() != '['))
                    return false;
                stack.pop();
            }
        }
        if (!stack.isEmpty())
            return false;
        return true;
    }
}
