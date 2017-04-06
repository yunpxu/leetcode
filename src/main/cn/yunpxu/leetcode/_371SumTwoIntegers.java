package cn.yunpxu.leetcode;

/**
 * Created by Peter Xu on 04/06/2017.
 */
public class _371SumTwoIntegers {
    public static void main(String[] args) {
        System.out.println(getSum(0, 1));
        System.out.println(getSum(1, 1));
        System.out.println(getSum(1, 2));
    }

    public static int getSum(int a, int b) {
        while (a != 0 && b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a | b;
    }
}
