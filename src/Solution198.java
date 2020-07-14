/**
 * @author Vamsi Krishna Govada on 7/13/2020.
 * @project LeetCode
 */


// House Robber


public class Solution198 {
    public int rob(int[] nums) {

        int len = nums.length;
        if (len == 0) return 0;
        if (len == 1) return nums[0];
        int max_now = nums[len - 1], max_next = nums[len - 2];
        int max_temp = max_temp = Math.max(max_now, max_next);
        for (int i = len - 3; i >= 0; i--) {

            max_now = nums[i] + max_now;
            max_next = Math.max(max_next, max_temp);

            int temp = max_now;
            max_now = max_next;
            max_next = temp;

            max_temp = Math.max(max_now, max_next);
        }

        if (max_now > max_next)
            return max_now;
        else
            return max_next;
    }
}
