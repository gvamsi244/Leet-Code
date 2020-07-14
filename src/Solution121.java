/**
 * @author Vamsi Krishna Govada on 7/13/2020.
 * @project LeetCode
 */


// Best Time to Buy and Sell Stock


public class Solution121 {
    public int maxProfit(int[] prices) {

        int len = prices.length;
        int max = 0, output = 0;
        for (int i = 0; i < len - 1; i++) {
            int a = prices[i + 1];
            int b = prices[i];
            max = max + a - b;
            if (max <= 0)
                max = 0;

            if (max > output)
                output = max;
        }
        return output;

    }
}
