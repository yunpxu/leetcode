package cn.yunpxu.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yunpxu on 2017/3/28.
 */
public class _01TwoSum {

    public static void main(String[] args) {
        int[] array = new int[]{1, -2, 11, 12, -3, 5, 8};
        int target = -5;
        int[] result = twoSum(array, target);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        Map map = new HashMap<Integer, Integer>();

        for (int i = 0; i < size; i++) {
            int k = nums[i];
            if (map.containsKey(target - k)) {
                return new int[]{(int) map.get(target - k), i};
            }
            map.put(k, i);
        }
        return null;
    }
}
