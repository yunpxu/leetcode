package cn.yunpxu.leetcode;

/**
 * https://leetcode.com/problems/sort-array-by-parity/
 *
 * Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
 *
 * You may return any answer array that satisfies this condition.
 *
 * Example 1:
 *
 * Input: [3,1,2,4]
 * Output: [2,4,3,1]
 * The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 *
 */
public class _905SortArrayByParity {

    public static void main(String[] args) {
        int[] input = new int[]{3, 1, 2, 4};
        int[] output = sortArrayByParity(input);

        for (int i : output){
            System.out.println(i);
        }

    }

    public static int[] sortArrayByParity(int[] A) {
        int length = A.length;
        int[] output = new int[length];
        int start = 0;
        int end = length - 1;
        for (int i = 0; i < length; i++) {
            if ((A[i] & 1) == 1) {
                output[end--] = A[i];
            } else {
                output[start++] = A[i];
            }
        }
        return output;
    }
}
