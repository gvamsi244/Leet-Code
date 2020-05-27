/**
 * @author Vamsi Krishna Govada on 5/27/2020.
 * @project LeetCode
 */

// Fibonacci Number


import java.util.HashMap;


public class Solution509 {

    HashMap<Integer, Integer> hashMap = new HashMap<>();

    public int fib(int N) {

        if (N < 2)
            return N;

        else {
            if (hashMap.containsKey(N))
                return hashMap.get(N);
            else {
                int val = fib(N - 1) + fib(N - 2);
                hashMap.put(N, val);
                return val;
            }
        }
    }
}
