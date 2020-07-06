/**
 * @author Vamsi Krishna Govada on 7/6/2020.
 * @project LeetCode
 */


// Distribute Candies


import java.util.*;

public class Solution575 {
    public int distributeCandies(int[] candies) {
        HashSet<Integer> hashSet = new HashSet<>();
        int len = candies.length;
        for (int i = 0; i < len; i++)
            hashSet.add(candies[i]);

        int size = hashSet.size();

        len = len / 2;
        if (size < len)
            return size;
        else
            return len;
    }
}