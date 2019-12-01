package com.core.string;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println(getPalindrome("NITIN"));
    }

    private static boolean getPalindrome(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        System.out.println(sb.toString());
        if (str.equals(sb.toString())) {
            return true;
        }
        return false;
    }
}
