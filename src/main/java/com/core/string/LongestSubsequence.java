package com.core.string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubsequence {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int i = 0, j = 0;
        int maxLen = 0;
        boolean[] exists = new boolean[256];
        while (j < n) {
            if (exists[s.charAt(j)]) {
                // met the repeat character, update the maxlen;
                maxLen = Math.max(maxLen, j - i);
                // update pointer i
                while (s.charAt(i) != s.charAt(j)) {
                    exists[s.charAt(i)] = false;
                    i++;
                }
                i++;
                j++;
            } else {
                exists[s.charAt(j)] = true;
                j++;
            }
        }
        maxLen = Math.max(maxLen, n - i);
        return maxLen;
    }

    public static int nonlengthOfLongestSubstring(String s) {
        char[] count = new char[0];
        char[] arr = s.toCharArray();
        int increment = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        for (int j =0; j< s.length(); j++) {
            if (count[s.charAt(j)] == 1) {

            }
        }
        return 0;
    }
}
