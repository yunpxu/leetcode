package cn.yunpxu.leetcode;

/**
 * Created by yunpxu on 2017/3/29.
 */
public class _461HammingDistance {
    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        int k = i ^ j;
        int count = 0;
        for (int l = 0; l < 32; l++) {
            count += (k >> l) & 1;
        }
        System.out.println(count);
    }
}
