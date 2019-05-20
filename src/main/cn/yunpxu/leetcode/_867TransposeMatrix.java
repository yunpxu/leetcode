package cn.yunpxu.leetcode;

/**
 * 867. Transpose Matrix
 * <p>
 * https://leetcode.com/problems/transpose-matrix/
 * <p>
 * Input
 * 1	2	3
 * 4	5	6
 * 7	8	9
 * <p>
 * Output
 * 1	4	7
 * 2	5	8
 * 3	6	9
 * <p>
 * Input
 * 1	2	3
 * 4	5	6
 * <p>
 * Output
 * 1	4
 * 2	5
 * 3	6
 */
public class _867TransposeMatrix {
    public static void main(String[] args) {
        int[][] input = new int[][]{{1, 2, 3}, {4, 5, 6}};
        int[][] output = transpose(input);

        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output[0].length; j++) {
                System.out.print(output[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int[][] A) {
        int row = A[0].length;
        int column = A.length;
        int[][] result = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                result[i][j] = A[j][i];
            }
        }

        return result;
    }
}
