/**
 * @author Vamsi Krishna Govada on 7/12/2020.
 * @project LeetCode
 */


// Number of 1 Bits


public class Solution191 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int N) {
        int count = 0;
        while (N != 0) {
            count = count + (N & 1);
            N = N >>> 1;
        }
        return count;
    }
}