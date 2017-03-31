package cn.yunpxu.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yunpxu on 2017/3/30.
 */
public class _448DisappearedNumberInArray {
    public static void main(String[] args) {
        int[] nums = new int[]{4,3,2,7,8,2,3,1};
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int num = Math.abs(nums[i]) - 1;
            if (nums[num] > 0) {
                nums[num] = -nums[num];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
                System.out.println(i+1);
            }
        }
    }
}
