package cn.yunpxu.leetcode;

/**
 * Created by yunpxu on 2017/4/12.
 */
public class _557ReverseWordsInStringIII {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for (String word : words) {
            sb.append(reverseWord(word)).append(" ");
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }

    private static String reverseWord(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        char temp;
        while (i < j) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }
}
