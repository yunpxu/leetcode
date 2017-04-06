package cn.yunpxu.leetcode;

/**
 * Created by yunpxu on 2017/4/5.
 */
public class _258AddDigits {
    public static void main(String[] args) {
        int num = 0;
        System.out.println(addDigits(0));
    }
    public static int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        int mod9 = num % 9;
        return mod9 == 0 ? 9 : mod9;
    }
}
