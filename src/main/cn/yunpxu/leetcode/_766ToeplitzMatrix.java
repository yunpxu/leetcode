package cn.yunpxu.leetcode;

/**
 * 766. Toeplitz Matrix
 * https://leetcode.com/problems/toeplitz-matrix/
 * <p>
 * Input
 * 1	2	3	4
 * <p>
 * 5	1	2	3
 * <p>
 * 9	5	1	2
 * Output
 * true
 * <p>
 * Input
 * 1	2
 * <p>
 * 2	2
 * Output
 * false
 */
public class _766ToeplitzMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 1, 2, 3},
                {9, 5, 1, 2}
        };
        System.out.println(isToeplitzMatrix(matrix));
    }

    public static boolean isToeplitzMatrix(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;

        for (int i = 0; i < row - 1; i++) {
            for (int j = 0; j < column - 1; j++) {
                if (matrix[i][j] != matrix[i + 1][j + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
