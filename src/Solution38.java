/**
 * @author Vamsi Krishna Govada on 5/20/2020.
 * @project LeetCode
 */

// Count and Say

public class Solution38 {
    public static String convert(String str) {
        StringBuilder ret = new StringBuilder("");
        int len = str.length(), count = 1;
        for (int i = 0; i < len - 1; i++) {
            if (str.charAt(i) != str.charAt(i + 1)) {
                ret.append(count);
                ret.append(str.charAt(i));
                count = 1;
            } else
                count++;
        }
        ret.append(count);
        ret.append(str.charAt(len - 1));

        return ret.toString();
    }


    public String countAndSay(int n) {
        String output = "1";
        for (int i = 0; i < n - 1; i++)
            output = convert(output);
        return output;

    }
}
