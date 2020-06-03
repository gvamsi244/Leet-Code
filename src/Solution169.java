/**
 * @author Vamsi Krishna Govada on 6/3/2020.
 * @project LeetCode
 */

// Majority Element


public class Solution169 {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        int voter = 0, count = 0;
        for (int i = 0; i < len; i++) {
            if (count == 0) {
                voter = nums[i];
                count = 1;
            } else {
                if (voter == nums[i])
                    count++;
                else
                    count--;
            }
        }
        return voter;
    }
}
