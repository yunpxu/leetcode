package cn.yunpxu.leetcode;

import java.util.*;

/**
 * 1002. Find Common Characters
 * https://leetcode.com/problems/find-common-characters/
 */
public class _1002FindCommonCharacters {
    public static void main(String[] args) {
        String[] list = new String[]{"bella", "label", "roller"};
        commonChars(list);

    }

    public static List<String> commonChars(String[] A) {
        List<String> list = new ArrayList<String>();

        int[] result = new int[26];
        Arrays.fill(result, Integer.MAX_VALUE);

        for (int i = 0; i < A.length; i++) {
            toArray(A[i], result);
        }

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < result[i]; j++) {
                list.add((char) ('a' + i) + "");
            }
        }


        return null;
    }

    private static int[] toArray(String str, int[] result) {
        int[] array = new int[26];
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 'a';
            array[index] = array[index] + 1;
        }

        for (int j = 0; j < 26; j++) {
            result[j] = Math.min(array[j], result[j]);
        }

        return result;
    }


    public static List<String> commonChars1(String[] A) {
        Map<Character, Integer> baseMap = new HashMap<>();
        String str = A[0];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            baseMap.put(c, baseMap.getOrDefault(c, 0) + 1);
        }

        for (int i = 1; i < A.length; i++) {
            Map<Character, Integer> tempMap = new HashMap<>();
            str = A[i];
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (baseMap.containsKey(c)) {
                    tempMap.put(c, Math.min(tempMap.getOrDefault(c, 0) + 1, baseMap.get(c)));
                }
            }
            baseMap = tempMap;
        }

        List<String> result = new ArrayList<>();
        baseMap.forEach((k, v) -> {
            for (int i = 0; i < v; i++) {
                result.add(k.toString());
            }
        });
        return result;
    }
}
