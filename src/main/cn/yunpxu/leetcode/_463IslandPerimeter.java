package cn.yunpxu.leetcode;

/**
 * Created by yunpxu on 2017/3/30.
 */
public class _463IslandPerimeter {
    public static void main(String[] args) {
        int[][] grid = new int[][]{
                {0, 1, 0},
                {1, 1, 1},
                {0, 1, 0}};
        int perimeter = 0;

        for (int i = 0; i < grid.length; i++) {
            int[] li = grid[i];
            for (int j = 0; j < li.length; j++) {
                if (grid[i][j] == 1) {
                    perimeter += 4;
                    if (i - 1 >= 0 && grid[i - 1][j] == 1) {
                        perimeter -= 2;
                    }
                    if (j - 1 >= 0 && grid[i][j - 1] == 1) {
                        perimeter -= 2;
                    }
                }
            }
        }
        System.out.println(perimeter);
    }
}
