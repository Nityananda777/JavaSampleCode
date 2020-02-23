package com.core.string;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        // System.out.println(isAnagram(s1, s2));
        String s = "xaxbbbxx";
        System.out.print(anagram(s));
    }

    public static boolean isAnagram(String s1, String s2) {
        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);
    }

    static int anagram(String s) {
        int len = s.length();
        if (len % 2 == 0) {
            String s1 = s.substring(0, (len / 2));
            String s2 = s.substring((len / 2), len);

            String ss1 = Stream.of(s1.split("")).sorted().collect(Collectors.joining());
            String ss2 = Stream.of(s2.split("")).sorted().collect(Collectors.joining());
            System.out.println(ss1 + "  " + ss2);
            if (!ss1.equals(ss2)) {
				char[] ch1 = ss1.toCharArray();
				char[] ch2 = ss2.toCharArray();
            }
        }
        return 0;
    }

}
