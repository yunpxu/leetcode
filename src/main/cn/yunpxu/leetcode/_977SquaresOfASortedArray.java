package cn.yunpxu.leetcode;

/**
 * https://leetcode.com/problems/squares-of-a-sorted-array/
 * 977. Squares of a Sorted Array
 * Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.
 * <p>
 * Example 1:
 * <p>
 * Input: [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Example 2:
 * <p>
 * Input: [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= A.length <= 10000
 * -10000 <= A[i] <= 10000
 * A is sorted in non-decreasing order.
 */
public class _977SquaresOfASortedArray {
    public static void main(String[] args) {
        int[] input = new int[]{-4, -1, 0, 3, 10};
        //                      16,1,0
        int[] output = sortedSquares(input);

        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }

    }

    public static int[] sortedSquares(int[] A) {
        int length = A.length;
        int[] B = new int[length];
        int left = 0;
        int right = length - 1;
        int position = right;

        while (position >= 0) {
            if (A[right] * A[right] >= A[left] * A[left]) {
                B[position] = A[right] * A[right];
                right--;
            } else {
                B[position] = A[left] * A[left];
                left++;
            }
            position--;
        }
        return B;
    }
}
