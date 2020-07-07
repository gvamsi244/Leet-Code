/**
 * @author Vamsi Krishna Govada on 7/7/2020.
 * @project LeetCode
 */


// Power of Two


public class Solution231 {
    public boolean isPowerOfTwo(int n) {

        if ((n == 0) || (n == Integer.MIN_VALUE))
            return false;

        int temp = n & (n - 1);
        if (temp == 0)
            return true;
        else
            return false;
    }
}
