/**
 * @author Vamsi Krishna Govada on 5/20/2020.
 * @project LeetCode
 */

// Valid Anagram

public class Solution242 {
    public boolean isAnagram(String s, String t) {

        int array[] = new int[26];
        int s_len = s.length();
        int t_len = t.length();

        if (s_len != t_len)
            return false;

        for (int i = 0; i < s_len; i++) {
            array[s.charAt(i) - 'a'] += 1;
            array[t.charAt(i) - 'a'] -= 1;
        }

        for (int i = 0; i < 26; i++)
            if (array[i] != 0)
                return false;
        return true;
    }
}