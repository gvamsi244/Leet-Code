/**
 * @author Vamsi Krishna Govada on 5/16/2020.
 * @project LeetCode
 */

//Best Time to Buy and Sell Stock II

public class Solution122 {
    public int maxProfit(int[] prices) {

        int output=0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i]<prices[i+1])
                output+=prices[i+1]-prices[i];
        }
        return output;

    }
}
