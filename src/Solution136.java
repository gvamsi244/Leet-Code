/**
 * @author Vamsi Krishna Govada on 5/18/2020.
 * @project LeetCode
 */

// Single Number

import java.util.Arrays;

public class Solution136 {
    public int singleNumber(int[] nums) {
        int output=0;
        int len = nums.length;
        for(int i=0;i<len;i++){
            output=output^nums[i];
        }
        return output;
    }
}
