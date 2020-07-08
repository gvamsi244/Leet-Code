/**
 * @author Vamsi Krishna Govada on 7/8/2020.
 * @project LeetCode
 */


// Maximum Subarray


public class Solution53 {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int sum1 = 0, sum2 = Integer.MIN_VALUE;

        for (int i = 0; i < len; i++) {
            if (nums[i] > sum1 + nums[i])
                sum1 = nums[i];
            else
                sum1 += nums[i];
            if (sum1 > sum2)
                sum2 = sum1;
        }
        return sum2;
    }
}