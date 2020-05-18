/**
 * @author Vamsi Krishna Govada on 5/18/2020.
 * @project LeetCode
 */

// Plus One

public class Solution66 {
    public int[] plusOne(int[] digits) {
        int len = digits.length, carry = 0;
        if (digits[len - 1] < 9) {
            digits[len - 1]++;
            return digits;
        } else {
            for (int i = digits.length - 1; i >= 0; i--) {

                if (digits[i] == 9) {
                    digits[i] = 0;
                    carry = 1;
                } else if (carry == 1) {
                    digits[i]++;
                    carry = 0;
                    break;
                }
            }

            if (carry == 1) {
                int output[] = new int[len + 1];
                output[0] = 1;
                for (int i = 0; i < len; i++)
                    output[i + 1] = digits[i];
                return output;
            }
        }

        return digits;
    }
}
