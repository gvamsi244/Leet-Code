/**
 * @author Vamsi Krishna Govada on 7/8/2020.
 * @project LeetCode
 */


// Hamming Distance


public class Solution461 {
    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        int output = 0;
        while (z != 0) {
            if (z % 2 == 1)
                output++;
            z = z / 2;
        }
        return output;
    }
}
