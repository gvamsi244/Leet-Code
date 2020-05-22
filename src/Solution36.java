/**
 * @author Vamsi Krishna Govada on 5/18/2020.
 * @project LeetCode
 */

// Valid Sudoku


import java.util.HashMap;

public class Solution36 {
    public boolean isValidSudoku(char[][] board) {

        int len = 9;
        for (int i = 0; i < len; i++) {
            HashMap<Character, Integer> hashMap = new HashMap<>();
            for (int j = 0; j < len; j++) {
                if (board[i][j] != '.') {
                    if (hashMap.containsKey(board[i][j]))
                        return false;
                    else
                        hashMap.put(board[i][j], 0);
                }
            }
        }

        for (int i = 0; i < len; i++) {
            HashMap<Character, Integer> hashMap = new HashMap<>();
            for (int j = 0; j < len; j++) {
                if (board[j][i] != '.') {
                    if (hashMap.containsKey(board[j][i]))
                        return false;
                    else
                        hashMap.put(board[j][i], 0);
                }
            }
        }

        int k1 = 0, j1 = 0;
        for (int i = 0; i < len; i++) {
            HashMap<Character, Integer> hashMap = new HashMap<>();
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    k1 = (i * 3) % 9 + k;
                    j1 = 3 * (i / 3) + j;
                    if (board[j1][k1] != '.') {
                        if (hashMap.containsKey(board[j1][k1]))
                            return false;
                        else
                            hashMap.put(board[j1][k1], 0);
                    }
                }

            }
        }
        return true;
    }

}
