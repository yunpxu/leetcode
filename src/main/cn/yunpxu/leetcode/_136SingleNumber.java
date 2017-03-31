package cn.yunpxu.leetcode;

/**
 * Created by yunpxu on 2017/3/30.
 */
public class _136SingleNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 1, 2, 3, 5, 3};
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        System.out.println(result);
    }
}
