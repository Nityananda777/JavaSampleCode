package com.core.string;

import java.util.Arrays;
import java.util.HashSet;

public class AnagramSequence {
    public static void main(String[] args) {
        String str = "BACDGABCDA";
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
//                if (isAnagram(str.substring(i, j))) {
//                    set.add(str.substring(i, j));
//                }
            }
        }
    }


    private static boolean isAnagram(String s1, String s2) {
        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);
    }
}
