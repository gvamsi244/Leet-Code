/**
 * @author Vamsi Krishna Govada on 5/18/2020.
 * @project LeetCode
 */

// Two Sum

import java.util.Arrays;
import java.util.HashMap;

public class Solution1 {
    public int[] twoSum(int[] nums, int target) {

        int output[] = new int[2];
        int len = nums.length;
        int temp = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < len; i++) {
            temp = target - nums[i];
            if (hashMap.containsKey(temp)) {
                output[0] = i;
                output[1] = hashMap.get(temp);
                break;
            } else
                hashMap.put(nums[i], i);
        }
        Arrays.sort(output);
        return output;
    }
}
