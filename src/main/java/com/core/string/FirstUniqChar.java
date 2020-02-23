package com.core.string;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FirstUniqChar {
    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));

    }

    public static long sfirstUniqChar(String s) {
        char[] ch = s.toCharArray();

        Map<Character, Integer> MAP = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (MAP.containsKey(ch[i])) {
                MAP.put(ch[i], MAP.get(ch[i]) + 1);
            } else {
                MAP.put(ch[i], 1);
            }
        }
       return MAP.values().stream().filter(p -> p == 1).findFirst().get();
    }

    public static int firstUniqChar(String s) {
        int[] CHAR = new int[256];
        if (s == null || s.isEmpty()) return -1;

        for (int i = 0, l = s.length(); i < l; i++) CHAR[s.charAt(i)]++;

        for (int i = 0, l = s.length(); i < l; i++) {
            if (CHAR[s.charAt(i)] == 1) return i;
        }

        return -1;
    }

}
