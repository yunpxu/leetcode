package cn.yunpxu.leetcode;

import java.util.*;

/**
 * Created by yunpxu on 2017/3/30.
 */
public class _500_KeyboardRow {
    public static void main(String[] args) {
        Set<Character> row0 = new HashSet<>(Arrays.asList('Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P'));
        Set<Character> row1 = new HashSet<>(Arrays.asList('A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L'));
        Set<Character> row2 = new HashSet<>(Arrays.asList('Z', 'X', 'C', 'V', 'B', 'N', 'M'));

        String[] inputStrs = new String[]{"qw", "as", "za"};
        List<String> oneRowStrs = new ArrayList<>();

        for (String s : inputStrs) {
            char[] chars = s.toUpperCase().toCharArray();
            int i = 0;
            for (char c : chars) {
                if (row0.contains(c)) {
                    i = i | 1;
                } else if (row1.contains(c)) {
                    i = i | 2;
                } else if (row2.contains(c)) {
                    i = i | 4;
                }
            }
            if (i == 1 || i == 2 || i == 4) {
                oneRowStrs.add(s);
            }
        }
        String[] s = oneRowStrs.toArray(new String[0]);
        System.out.println(s);
    }
}
