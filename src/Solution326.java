/**
 * @author Vamsi Krishna Govada on 7/7/2020.
 * @project LeetCode
 */


// Power of Three


public class Solution326 {
    public static boolean isPowerOfThree(int n) {

        if ((n & 1) != 1)
            return false;

        double result1 = (Math.log10(n) / Math.log10(3));
        double result2 = (int) result1;

        if (result1 == result2)
            return true;
        else
            return false;
    }

}
