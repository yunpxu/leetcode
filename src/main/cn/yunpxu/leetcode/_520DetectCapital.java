package cn.yunpxu.leetcode;

/**
 * Created by yunpxu on 2017/3/30.
 */
public class _520DetectCapital {
    public static void main(String[] args) {
        String word = "Aaa";
        String s1 = word.toLowerCase();
        String s2 = word.toUpperCase();
        String s3 = s2.substring(0, 1) + s1.substring(1);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
//        System.out.println(word.equals(s1) || word.equals(s2) || word.equals(s3));
        System.out.println(word.matches("[A-Z]+|[a-z]+|[A-Z][a-z]+"));
    }
}
