/**
 * @author Vamsi Krishna Govada on 5/27/2020.
 * @project LeetCode
 */

// Climbing Stairs

import java.util.*;

public class Solution70 {

    HashMap<Integer, Integer> hashMap = new HashMap<>();

    public int climbStairs(int n) {
        if (n <= 3)
            return n;
        else {
            if (hashMap.containsKey(n))
                return hashMap.get(n);
            else {
                int a = climbStairs(n - 1);
                hashMap.put(n - 1, a);
                int b = climbStairs(n - 2);

                hashMap.put(n - 2, b);
                System.out.println(a + b);
                return (a + b);
            }
        }
    }
}
