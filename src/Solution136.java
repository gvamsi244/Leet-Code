/**
 * @author Vamsi Krishna Govada on 5/18/2020.
 * @project LeetCode
 */

// Single Number

import java.util.Arrays;

public class Solution136 {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if((nums.length==1))
            return nums[0];
        for(int i=1;i<nums.length;i=i+2){
            if(nums[i-1]==nums[i]){
                if((i+2)<nums.length)
                    continue;
                else
                    return nums[nums.length-1];

            }
            else
                return nums[i-1];
        }

        return 0;
    }
}
