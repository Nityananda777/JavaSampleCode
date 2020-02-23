package com.core.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstNonRepetiveCharater {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null) {
            return 0;
        }
        int max = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        int len = s.length();
        int l = 0;
        for (int r = 0; r < len; r++) {
            char c = s.charAt(r);

            if (map.containsKey(c) && map.get(c) >= l) {
                l = map.get(c) + 1;
            }

            // replace the last index of the character c.
            map.put(c, r);

            // replace the max value.
            max = Math.max(max, r - l + 1);
            System.out.println("max value is "+max);
        }

        return max;
    }

    // Driver method
    public static void main(String[] args) {
        String str = "pwwkew";
        int size = lengthOfLongestSubstring(str);

        System.out.println(size == -1 ? "Either all characters are repeating or string " +
                "is empty" : "First non-repeating character is " + size);
    }
}