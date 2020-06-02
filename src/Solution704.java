/**
 * @author Vamsi Krishna Govada on 6/2/2020.
 * @project LeetCode
 */

// Binary Search


public class Solution704 {
    public int search(int[] nums, int target){
        int len = nums.length;
        int output = -1;
        int start = 0, last = len - 1;
        int mid = 0;
        while (start <= last) {
            mid = (start + last) / 2;
            if (nums[mid] == target)
                return mid;

            else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return output;
    }
}
