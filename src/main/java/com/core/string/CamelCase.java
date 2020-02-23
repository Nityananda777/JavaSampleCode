package com.core.string;

public class CamelCase {
    public static void main(String[] args) {

    }

    static int camelcase(String s) {
        Character c;
        char charArry[] = s.toCharArray();
        int count = 0;
        for (Character ch : charArry) {
            if (Character.isUpperCase(ch)) {
                count++;
            }
        }
   return count+1;
    }
}
