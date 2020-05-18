/**
 * @author Vamsi Krishna Govada on 5/18/2020.
 * @project LeetCode
 */
public class Solution189 {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int iterator_index = 0, starting_index = 0, storage_value = 0, temporary_swapping = 0;
        int gcd = gcd(len, k);
        for (int i = 0; i < gcd; i++) {
            starting_index = i; iterator_index = i; storage_value = nums[i];
            while (true) {
                iterator_index = (iterator_index + k) % len;
                temporary_swapping = nums[iterator_index];
                nums[iterator_index] = storage_value;
                storage_value = temporary_swapping;

                if (iterator_index == starting_index)
                    break;
            }
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

}
