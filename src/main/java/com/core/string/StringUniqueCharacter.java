package com.core.string;

import java.util.HashMap;
import java.util.Map;

public class StringUniqueCharacter {
    public static void main(String[] args) {
        String s = "helloworld";
        System.out.println(isUniqueChar(s));
        System.out.println(s.chars().distinct().count());
    }
        private static boolean isUniqueChar(String s) {


        char a[] = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : a) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else
                map.put(ch, map.get(ch) + 1);
        }

        for (char ch1 : a) {
            if (map.get(ch1) > 1) {
                return false;
            }
        }
        return  true;
    }
}
