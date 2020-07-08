/**
 * @author Vamsi Krishna Govada on 7/8/2020.
 * @project LeetCode
 */
public class Solution13 {
    public int romanToInt(String s) {
        int I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000;
        int output = 0;
        boolean flagSet = false;
        int len = s.length();
        int temp = 0;
        char next;
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);

            if (i + 1 < len)
                next = s.charAt(i + 1);
            else
                next = 'I';

            if (c == 'I') {
                if ((next == 'V') || (next == 'X'))
                    flagSet = true;
                temp = I;
            } else if (c == 'V')
                temp = V;

            else if (c == 'X') {
                temp = X;
                if ((next == 'L') || (next == 'C'))
                    flagSet = true;
            } else if (c == 'L')
                temp = L;

            else if (c == 'C') {
                temp = C;
                if ((next == 'D') || (next == 'M'))
                    flagSet = true;
            } else if (c == 'D')
                temp = D;

            else if (c == 'M')
                temp = M;


            if (flagSet) {
                temp = temp * -1;
                flagSet = false;
            }
            output = output + temp;
        }
        return output;
    }
}
