package cn.yunpxu.leetcode;

/**
 * Created by Peter Xu on 04/06/2017.
 */
public class _283MoveZeroes {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12, 0};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int size = nums.length;
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                System.out.println(nums[i]);
                j++;
            }
        }
        while (j < size) {
            nums[j++] = 0;
            System.out.println(0);
        }
    }
}
