/**
 * @author Vamsi Krishna Govada on 5/18/2020.
 * @project LeetCode
 */

// Rotate Image

public class Solution48 {
    public void rotate(int[][] matrix) {

        int len=matrix.length;
        int[][] output = new int[len][len];

        for(int i=0;i<len;i++)
            for(int j=0;j<len;j++)
                output[i][j] = matrix[len-j-1][i];

        for(int i=0;i<len;i++)
            for(int j=0;j<len;j++)
                matrix[i][j] = output[i][j];
    }
}
