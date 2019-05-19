package cn.yunpxu.leetcode;

/**
 * 999. Available Captures for Rook
 * https://leetcode.com/problems/available-captures-for-rook/
 * <p>
 * <p>
 * board.length == board[i].length == 8
 * board[i][j] is either 'R', '.', 'B', or 'p'
 * There is exactly one cell with board[i][j] == 'R'
 */
public class _999AvailableCapturesforRook {
    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'.', '.', '.', 'B', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'p', 'p', '.', 'R', '.', 'p', 'B', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'.', '.', '.', 'B', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'}
        };
        numRookCaptures(board);

    }

    public static int numRookCaptures(char[][] board) {
        int LEN = 8;
        int R_X = 0;
        int R_Y = 0;
        int count = 0;

        //find the position of 'R'
        for (int y = 0; y < LEN; y++) {
            for (int x = 0; x < LEN; x++) {
                if (board[y][x] == 'R') {
                    R_X = x;
                    R_Y = y;
                }
            }
        }

        //up
        for (int y = R_Y - 1; y >= 0; y--) {
            if (board[y][R_X] == 'p') {
                count++;
                break;
            }
            if (board[y][R_X] == 'B') {
                break;
            }
        }

        //down
        for (int y = R_Y + 1; y < LEN; y++) {
            if (board[y][R_X] == 'p') {
                count++;
                break;
            }
            if (board[y][R_X] == 'B') {
                break;
            }
        }

        //left
        for (int x = R_X - 1; x >= 0; x--) {
            if (board[R_Y][x] == 'p') {
                count++;
                break;
            }
            if (board[R_Y][x] == 'B') {
                break;
            }
        }

        //right
        for (int x = R_X + 1; x < LEN; x++) {
            if (board[R_Y][x] == 'p') {
                count++;
                break;
            }
            if (board[R_Y][x] == 'B') {
                break;
            }
        }
        return count;
    }
}
