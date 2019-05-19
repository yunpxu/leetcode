package cn.yunpxu.leetcode;

/**
 * 985. Sum of Even Numbers After Queries
 * https://leetcode.com/problems/sum-of-even-numbers-after-queries/
 * <p>
 * Input: A = [1,2,3,4], queries = [[1,0],[-3,1],[-4,0],[2,3]]
 * Output: [8,6,2,4]
 * Explanation:
 * At the beginning, the array is [1,2,3,4].
 * After adding 1 to A[0], the array is [2,2,3,4], and the sum of even values is 2 + 2 + 4 = 8.
 * After adding -3 to A[1], the array is [2,-1,3,4], and the sum of even values is 2 + 4 = 6.
 * After adding -4 to A[0], the array is [-2,-1,3,4], and the sum of even values is -2 + 4 = 2.
 * After adding 2 to A[3], the array is [-2,-1,3,6], and the sum of even values is -2 + 6 = 4.
 */
public class _985SumofEvenNumbersAfterQueries {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        int[][] queries = {{1, 0}, {-3, 1}, {-4, 0}, {2, 3}};
        sumEvenAfterQueries(A, queries);
    }


    public static int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] result = new int[queries.length];
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            if ((A[i] & 1) == 0) {
                sum += A[i];
            }
        }

        for (int i = 0; i < queries.length; i++) {
            int index = queries[i][1];
            if ((A[index] & 1) == 0) {
                sum -= A[index];
            }
            A[index] = A[index] + queries[i][0];

            if ((A[index] & 1) == 0) {
                sum += A[index];
            }
            result[i] = sum;
            System.out.println(sum);
        }

        return result;
    }


    public static int[] sumEvenAfterQueries1(int[] A, int[][] queries) {
        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int index = queries[i][1];
            A[index] = A[index] + queries[i][0];

            result[i] = countEven(A);
            System.out.println(result[i]);
        }
        return result;
    }

    private static int countEven(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if ((a[i] & 1) == 0) {
                sum += a[i];
            }
        }
        return sum;
    }
}
