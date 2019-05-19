package cn.yunpxu.leetcode;

/**
 * 922. Sort Array By Parity II
 * https://leetcode.com/problems/sort-array-by-parity-ii/
 * <p>
 * Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even.
 * <p>
 * Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.
 * <p>
 * You may return any answer array that satisfies this condition.
 * <p>
 * Example 1:
 * <p>
 * Input: [4,2,5,7]
 * Output: [4,5,2,7]
 * Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
 * <p>
 * <p>
 * Note:
 * <p>
 * 2 <= A.length <= 20000
 * A.length % 2 == 0
 * 0 <= A[i] <= 1000
 */
public class _922SortArrayByParityII {
    public static void main(String[] args) {
        int[] input = new int[]{4, 2, 5, 7};
        int[] output = sortArrayByParityII(input);

        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }

    public static int[] sortArrayByParityII(int[] A) {
        int len = A.length;
        int[] B = new int[len];
        int evenIndex = 0;
        int oddIndex = 1;
        for (int i = 0; i < len; i++) {
            if ((A[i] & 1) == 1) {
                B[oddIndex] = A[i];
                oddIndex += 2;
            } else {
                B[evenIndex] = A[i];
                evenIndex += 2;
            }
        }
        return B;
    }
}
