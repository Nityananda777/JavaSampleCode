package com.core.string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString {

    public static void main(String[] args) {
        int longestStringLen = 0;
        String subString = "aab";
       System.out.println( lengthOfLongestSubstring(subString));

    }

    public static  int lengthOfLongestSubstring(String s) {
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();
        char arr[] = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            char ch = arr[i];
            if (!map.containsKey(ch)) {
                map.put(ch, i);
            } else {
                i = map.get(ch);
                map.clear();
            }
            if (map.size() > count) {
                count++;
            }
        }
        return count;

    }

}
