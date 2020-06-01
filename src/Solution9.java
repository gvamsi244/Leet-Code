/**
 * @author Vamsi Krishna Govada on 6/1/2020.
 * @project LeetCode
 */

// Palindrome Number


public class Solution9 {

    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        StringBuilder sb = new StringBuilder();
        int x_dummy = x;
        while (x_dummy != 0) {
            sb.append(x_dummy % 10);
            x_dummy = x_dummy / 10;
        }

        int len = sb.length();
        for (int i = 0; i < len; i++) {
            if (sb.charAt(i) != sb.charAt(len - i - 1))
                return false;
        }
        return true;
    }
}
