package cn.yunpxu.leetcode;

/**
 * Created by yunpxu on 2017/4/12.
 */
public class _521LongestUncommonSubsequenceI {
    public static void main(String[] args) {
        findLUSlength("a", "a");
        findLUSlength("a", "abc");
    }

    public static int findLUSlength(String a, String b) {
        return a.equals(b) ? -1 : Math.max(a.length(), b.length());
    }
}
