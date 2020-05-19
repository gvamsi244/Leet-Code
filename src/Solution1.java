/**
 * @author Vamsi Krishna Govada on 5/18/2020.
 * @project LeetCode
 */

// Two Sum

import java.util.Arrays;

public class Solution1 {

    public int[] twoSum(int[] nums, int target) {

        int output[] = new int[2];

        L1:
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length && j != i; j++) {
                if (nums[i] + nums[j] == target) {
                    output[0] = i;
                    output[1] = j;
                    break L1;
                }
            }
        }
        Arrays.sort(output);
        return output;
    }
}
