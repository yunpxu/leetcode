package cn.yunpxu.leetcode;

/**
 * Created by Peter Xu on 04/06/2017.
 */
public class _492ConstructRectangle {
    public static void main(String[] args) {
        constructRectangle(10);
        constructRectangle(9);
    }

    public static int[] constructRectangle(int area) {
        int sqrt = ((Double) Math.sqrt(area)).intValue();
        int left = sqrt;
        int right = sqrt;

        int product = left * right;
        while (product != area) {
            if (product > area) {
                left--;
            }
            if (product < area) {
                right++;
            }
            product = left * right;
        }
        System.out.println(String.format("%d * %d ", left, right));
        return new int[]{left, right};
    }
}
