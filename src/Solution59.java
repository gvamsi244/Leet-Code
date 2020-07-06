/**
 * @author Vamsi Krishna Govada on 7/6/2020.
 * @project LeetCode
 */


// Spiral Matrix II


public class Solution59 {

    public int[][] generateMatrix(int n) {

        if (n == 1) return new int[][]{{1}};
        int arr[][] = new int[n][n];
        int limit = n * n;
        int start = 0, end = n;
        int iterator = 1;

        l1:
        while (iterator <= limit) {

            for (int i = start; i < end - 1; i++) {
                arr[start][i] = iterator++;
                if (iterator == limit)
                    break l1;
            }

            for (int i = start; i < end - 1; i++) {
                arr[i][end - 1] = iterator++;
                if (iterator == limit)
                    break l1;
            }


            for (int i = end - 1; i > start; i--) {
                arr[end - 1][i] = iterator++;
                if (iterator == limit)
                    break l1;

            }

            for (int i = end - 1; i > start; i--) {
                arr[i][start] = iterator++;
                if (iterator == limit)
                    break l1;

            }
            start++;
            end--;
        }
        if (n % 2 != 0)
            arr[n / 2][n / 2] = limit;
        else
            arr[n / 2][n / 2 - 1] = limit;
        return arr;
    }
}
