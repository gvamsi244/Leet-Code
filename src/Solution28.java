/**
 * @author Vamsi Krishna Govada on 5/20/2020.
 * @project LeetCode
 */

// Implement strStr()

public class Solution28 {
    public int strStr(String haystack, String needle) {
        int len_hay = haystack.length();
        int len_need = needle.length();
        int flag = 0;
        if ((len_hay == 0) && (len_need == 0))
            return 0;
        if (len_need > len_hay)
            return -1;
        int pointer1 = 0;
        int j = 0;
        for (int i = 0; i < len_hay; i++) {
            pointer1 = i;

            for (j = 0; j < len_need && flag != 1; j++) {
                if (haystack.charAt(i) == needle.charAt(j)) {
                    i++;
                    if (i >= len_hay) {
                        flag = 1;
                        break;
                    }
                } else {
                    i = pointer1;
                    break;
                }
            }
            if (j == len_need)
                return pointer1;
            if (flag == 1)
                if (j + 1 == len_need)
                    return pointer1;
                else
                    return -1;
        }
        return -1;
    }
}
