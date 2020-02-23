package com.core.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NonRepetiveCharater {

    public static void main(String[] args) {
        String s = "abcdefghija";

        System.out.print(firstNonRepeatingChar(s));

    }

    public static char firstNonRepeatingChar(String s) {
        char[] charArr = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : charArr) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        char ch = 0;
        for (char c : charArr)
            if (map.get(c) == 1) {
                return c;
            }
        return ch;
    }
}