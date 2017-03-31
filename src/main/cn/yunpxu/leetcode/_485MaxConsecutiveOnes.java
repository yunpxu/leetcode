package cn.yunpxu.leetcode;

/**
 * Created by yunpxu on 2017/3/30.
 */
public class _485MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0};
        int max = 0;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num == 1) {
                k++;
            } else if (num == 0 || i == nums.length - 1) {
                max = k > max ? k : max;
                k = 0;
            }
        }
        System.out.println(max);
    }
}
