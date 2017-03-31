package cn.yunpxu.leetcode;

/**
 * Created by yunpxu on 2017/3/30.
 */
public class _344ReverseString {
    public static void main(String[] args) {
        String s = "Hello";
        char[] chars = s.toCharArray();
        int size = chars.length;
        char[] reverseChars = new char[size];

        for (int i = 0; i < size; i++) {
            reverseChars[i] = chars[size - i - 1];
        }
        System.out.println(new String(reverseChars));
    }
}
