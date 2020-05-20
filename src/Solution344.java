/**
 * @author Vamsi Krishna Govada on 5/20/2020.
 * @project LeetCode
 */

// Reverse String

public class Solution344 {
    public void reverseString(char[] s) {
        int start=0, last=s.length-1;
        while(start<last){
            char temp=s[start];
            s[start++]=s[last];
            s[last--]=temp;
        }
    }
}
