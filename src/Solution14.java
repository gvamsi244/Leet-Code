/**
 * @author Vamsi Krishna Govada on 5/20/2020.
 * @project LeetCode
 */

// Longest Common Prefix

public class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        String output = "";

        if (strs.length == 0)
            return output;

        int flag = 0, min = strs[0].length(), len = strs.length;

        for (int i = 0; i < len; i++)
            if (strs[i].length() < min)
                min = strs[i].length();

        L1:
        for (int i = 0; i < min; i++) {
            for (int j = 0; j < len - 1; j++) {
                if (strs[j].charAt(i) == strs[j + 1].charAt(i)) {
                    flag = 1;
                } else
                    break L1;
            }
            output += strs[0].charAt(i);
        }

        return output;
    }
}
