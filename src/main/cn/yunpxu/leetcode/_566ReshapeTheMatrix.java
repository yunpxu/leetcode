package cn.yunpxu.leetcode;

/**
 * 566. Reshape the Matrix
 * https://leetcode.com/problems/reshape-the-matrix/
 * <p>
 * Input:
 * nums =
 * [[1,2],
 * [3,4]]
 * r = 1, c = 4
 * Output:
 * [[1,2,3,4]]
 */
public class _566ReshapeTheMatrix {
    public static void main(String[] args) {
        int[][] nums = {
                {1, 2},
                {3, 4}
        };

        matrixReshape(nums, 1, 4);

    }

    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        int row = nums.length;
        int column = nums[0].length;
        if (row * column != r * c) {
            return nums;
        }


        int[][] result = new int[r][c];
        int count = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = nums[count / column][count % column];
//                System.out.println(i + " " + j + " " + count / column + " " + count % column);
                count++;
            }
        }
        return result;
    }
}
