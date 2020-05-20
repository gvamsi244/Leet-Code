/**
 * @author Vamsi Krishna Govada on 5/20/2020.
 * @project LeetCode
 */

// Valid Palindrome

public class Solution125 {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder(s);
        int start = 0, last = s.length() - 1;
        while (start < last) {
            char c1 = s.charAt(start), c2 = s.charAt(last);
            if (!((c1 >= 'a' && c1 <= 'z') || (c1 >= '0' && c1 <= '9'))) {
                start++;
                continue;
            } else if (!((c2 >= 'a' && c2 <= 'z') || (c2 >= '0' && c2 <= '9'))) {
                last--;
                continue;
            } else {
                if (s.charAt(start) != s.charAt(last))
                    return false;
                start++;
                last--;
            }
        }
        return true;
    }
}
