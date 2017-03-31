package cn.yunpxu.leetcode;

/**
 * Created by yunpxu on 2017/3/31.
 */
public class _389FindDifference {
    public static void main(String[] args) {
        String s = "abc";
        String t = "abcd";
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        int size = sc.length;
        char result = tc[size];
        for (int i = 0; i < size; i++) {
            result = (char) (sc[i] ^ tc[i] ^ result);
        }
    }
}
