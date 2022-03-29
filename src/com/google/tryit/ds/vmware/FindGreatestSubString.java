package com.google.tryit.ds.vmware;

import java.util.ArrayList;
import java.util.List;
public class FindGreatestSubString {
    public static void main(String args[])
    {
        String bigLineInput="abcdeabca";
        System.out.println(lengthOfLongestSubstring(bigLineInput));
    }

    public static int lengthOfLongestSubstring(String s) {

        int n = s.length();

        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (checkRepetition(s, i, j)) {
                    res = Math.max(res, j - i + 1);
                }
            }
        }

        return res;
    }

    private static boolean checkRepetition(String s, int start, int end) {
        int[] chars = new int[128];

        for (int i = start; i <= end; i++) {
            char c = s.charAt(i);
            chars[c]++;
            if (chars[c] > 1) {
                return false;
            }
        }
        return true;
    }
}
