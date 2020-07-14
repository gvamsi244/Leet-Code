/**
 * @author Vamsi Krishna Govada on 7/14/2020.
 * @project LeetCode
 */


// Shuffle an Array


import java.util.*;


public class Solution384 {

    static class Solution {

        private static int[] nums;
        private static int[] numsBackUp;
        private static int len;

        public Solution(int[] nums) {
            this.len = nums.length;
            this.nums = Arrays.copyOf(nums, nums.length);
            numsBackUp = Arrays.copyOf(nums, nums.length);
        }

        /**
         * Resets the array to its original configuration and return it.
         */
        public static int[] reset() {
            nums = Arrays.copyOf(numsBackUp, numsBackUp.length);
            return nums;
        }

        /**
         * Returns a random shuffling of the array.
         */
        public static int[] shuffle() {
            Random random = new Random();
            for (int i = 0; i < len; i++) {
                int j = random.nextInt(len);
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            return nums;
        }
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
