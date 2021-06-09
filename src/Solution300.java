/**
 * @author Vamsi Krishna Govada on  6/9/2021.
 * @project Leet-Code
 */
public class Solution300 {
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        int temp[]= new int[len];

        for(int i=1;i<len;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    int val = temp[j]+1;
                    if(val>temp[i])
                        temp[i]=val;
                }
            }
        }

        int max =0;
        for(int i=0;i<len;i++)
            if(temp[i]>max)
                max=temp[i];
        return max+1;
    }
}
