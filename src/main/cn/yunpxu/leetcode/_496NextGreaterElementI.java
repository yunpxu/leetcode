package cn.yunpxu.leetcode;

import java.util.*;

/**
 * Created by yunpxu on 2017/3/30.
 */
public class _496NextGreaterElementI {
    public static void main(String[] args) {
        int[] findNums = new int[]{4, 1};
        int[] nums = new int[]{1, 2, 4};
        nextGreaterElement2(findNums, nums);
    }


    public static int[] nextGreaterElement2(int[] findNums, int[] nums) {
        int num1Size = findNums.length;
        int[] result = new int[num1Size];

        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> valMap = new HashMap<>();

        for (int v : nums) {
            while(!stack.isEmpty() && stack.peek() < v){
                valMap.put(stack.pop(), v);
            }
            stack.push(v);
        }

        for (int i = 0; i < num1Size; i++) {
            result[i] = valMap.getOrDefault(findNums[i], -1);
        }
        return result;
    }

    public static int[] nextGreaterElement(int[] findNums, int[] nums) {
        List<Integer> l2 = new ArrayList<>();
        for (int i : nums) {
            l2.add(i);
        }

        int num1Size = findNums.length;
        int[] result = new int[num1Size];

        for (int i1 = 0; i1 < num1Size; i1++) {
            int v1 = findNums[i1];

            int i2 = l2.indexOf(v1) + 1;
            int v = -1;

            while (i2 < l2.size()) {
                int v2 = nums[i2];
                if (v2 > v1) {
                    v = v2;
                    break;
                }
                i2++;
            }
            result[i1] = v;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        return result;
    }
}