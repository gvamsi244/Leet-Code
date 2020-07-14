/**
 * @author Vamsi Krishna Govada on 7/13/2020.
 * @project LeetCode
 */


// Pascal's Triangle


import java.util.*;


public class Solution118 {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> output = new ArrayList<>();

        if (numRows == 0)
            return output;
        {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            output.add(temp);
        }
        for (int i = 1; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for (int j = 0; j < output.get(i - 1).size() - 1; j++) {
                int a = output.get(i - 1).get(j);
                int b = output.get(i - 1).get(j + 1);
                list.add(a + b);
            }
            list.add(1);
            output.add(list);
        }
        return output;
    }
}
