/**
 * @author Vamsi Krishna Govada on 5/18/2020.
 * @project LeetCode
 */

// Move Zeroes

public class Solution283 {

    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int j = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        for (int i = j; i < len; i++)
            nums[i] = 0;
    }

}
