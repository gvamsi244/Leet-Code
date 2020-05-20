/**
 * @author Vamsi Krishna Govada on 5/20/2020.
 * @project LeetCode
 */

// Reverse Integer

public class Solution7 {
    public int reverse(int x) {
        int x_duplicate = x;
        long output = 0;
        while (x_duplicate != 0) {
            int temp = (int) x_duplicate % 10;
            output = output * 10 + temp;
            x_duplicate /= 10;
        }
        if ((output < 2147483647) && (output > -2147483648))
            return (int) output;
        else return 0;
    }
}
