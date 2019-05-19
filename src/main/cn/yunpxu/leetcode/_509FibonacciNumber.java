package cn.yunpxu.leetcode;

/**
 * 509. Fibonacci Number
 * https://leetcode.com/problems/fibonacci-number/
 * <p>
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
 * <p>
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), for N > 1.
 * <p>
 * Note
 * 0 ≤ N ≤ 30.
 */
public class _509FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fib1(3));
    }

    public static int fib(int N) {
        if (N == 0 || N == 1) {
            return N;
        } else {
            return fib(N - 1) + fib(N - 2);
        }
    }

    public static int fib1(int N) {
        if (N <= 1)
            return N;
        int fn0 = 0;
        int fn1 = 1;

        for (int i = 2; i <= N; i++) {
            int sum = fn0 + fn1;
            fn0 = fn1;
            fn1 = sum;
        }

        return fn1;
    }

}
