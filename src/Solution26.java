import java.util.*;

public class Solution26 {
    public static int removeDuplicates(int[] nums) {
        if((nums.length==0) || (nums.length==1))
            return nums.length;

        int pointer_1=0, new_number=nums[0];
        for(int pointer_2=1;pointer_2<nums.length;pointer_2++){
            if(nums[pointer_2]!=new_number)
            {
                new_number=nums[pointer_2];
                pointer_1++;
                nums[pointer_1]=nums[pointer_2];
            }
        }
        return ++pointer_1;
    }

    public static void main(String[] args) {
        int [] arr = new int[]{ 0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
        System.out.println("FInal Arrays :"+Arrays.toString(arr));


    }
}
