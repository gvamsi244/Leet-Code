/**
 * @author Vamsi Krishna Govada on 5/20/2020.
 * @project LeetCode
 */

// String to Integer (atoi)

public class Solution8 {
    public int myAtoi(String str) {

        str = str.trim();

        if (str.isEmpty())
            return 0;

        String str_toINT = "";
        int flag = 0, output = 0;
        int len = str.length();
        char c2 = str.charAt(0);
        char operand = ' ';

        if ((c2 == '+') || (c2 == '-')) {
            if (len == 1)
                return 0;
            str_toINT += c2;
            flag = 1;
            operand = c2;
            c2 = str.charAt(1);
        }

        if (!(c2 >= '0' && c2 <= '9'))
            return 0;

        for (int i = flag; i < len; i++) {
            c2 = str.charAt(i);
            if (!(c2 >= '0' && c2 <= '9'))
                break;
            else
                str_toINT += c2;
        }
        try {
            output = Integer.parseInt(str_toINT);
        } catch (Exception e) {
            if (operand == '-')
                return -2147483648;
            else
                return 2147483647;
        }
        return output;
    }
}
