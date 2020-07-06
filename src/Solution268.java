/**
 * @author Vamsi Krishna Govada on 7/6/2020.
 * @project LeetCode
 */


// Missing Number


public class Solution268 {

    public int missingNumber(int[] nums) {
        int len = nums.length;
        int sum1 = (len * (len + 1)) / 2;
        int sum2 = 0;

        for (int i = 0; i < len; i++)
            sum2 += nums[i];

        return sum1 - sum2;
    }
}
