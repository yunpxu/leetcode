package cn.yunpxu.leetcode;

/**
 * Created by yunpxu on 2017/3/30.
 */
public class _476NumberComplement {
    public static void main(String[] args) {
        int num = Integer.MAX_VALUE;
        System.out.println(num);

        int i = 0;
        while (((1 << i) <= num) && i < 31) {
            i++;
        }
        int k = ((1 << i) - 1) ^ num;
        System.out.println(k);
    }
}
