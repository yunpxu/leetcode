package cn.yunpxu.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yunpxu on 2017/3/30.
 */
public class _412FizzBuzz {
    public static void main(String[] args) {
        int n = 15;
        List<String> list = new ArrayList<>();
        String s = null;
        for (int i = 1; i < n + 1; i++) {
            int flag = 0;
            if (i % 3 == 0) {
                flag = flag | 1;
            }
            if (i % 5 == 0) {
                flag = flag | 2;
            }
            switch (flag) {
                case 0:
                    s = String.valueOf(i);
                    break;
                case 1:
                    s = "Fizz";
                    break;
                case 2:
                    s = "Buzz";
                    break;
                case 3:
                    s = "FizzBuzz";
                    break;
                default:
                    s = "";
            }
            list.add(s);
            System.out.println(s);
        }
    }
}
