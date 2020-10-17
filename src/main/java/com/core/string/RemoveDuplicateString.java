package com.core.string;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * Remove Duplicate Character from String
 */
public class RemoveDuplicateString {

    public static void main(String[] args) {
        String s = "aabbaacc";
        char a[] = s.toCharArray();
        Set<Character> set = new LinkedHashSet<Character>();
        for (char cc : a) {
            set.add(cc);
        }
        String sb = set.stream().map(ss -> String.valueOf(ss.charValue())).collect(Collectors.joining());
        System.out.println(sb);
    }

}
