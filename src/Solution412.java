/**
 * @author Vamsi Krishna Govada on 5/25/2020.
 * @project LeetCode
 */

// Fizz Buzz


import java.util.*;

public class Solution412 {
    public List<String> fizzBuzz(int n) {

        List<String> output = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0)
                output.add("FizzBuzz");
            else if (i % 5 == 0)
                output.add("Buzz");
            else if (i % 3 == 0)
                output.add("Fizz");
            else
                output.add(String.valueOf(i));
        }
        return output;
    }
}
