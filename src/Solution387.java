/**
 * @author Vamsi Krishna Govada on 5/20/2020.
 * @project LeetCode
 */

// First Unique Character in a String

public class Solution387 {
    public int firstUniqChar(String s) {
        char output[] = new char[26];
        int len = s.length();
        for (int i = 0; i < len; i++)
            output[s.charAt(i) - 97] += '1';

        for (int i = 0; i < len; i++) {
            if (output[s.charAt(i) - 97] == '1')
                return i;
        }
        return -1;
    }

}
