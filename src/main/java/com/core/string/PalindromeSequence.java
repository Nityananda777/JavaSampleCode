package com.core.string;

import java.util.*;

class PalindromeSequence {

    public static void main(String[] args) {
        String str = "abc";
       System.out.println( findAllPalindromesUsingCenter(str));

    }

    public  static Set<String> findAllPalindromesUsingCenter(String input) {
        Set<String> palindromes = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            palindromes.addAll(findPalindromes(input, i, i + 1));
            palindromes.addAll(findPalindromes(input, i, i));
        }
        return palindromes;
    }
    private static Set<String> findPalindromes(String input, int low, int high) {
        Set<String> result = new HashSet<>();
        while (low >= 0 && high < input.length() && input.charAt(low) == input.charAt(high)) {
            result.add(input.substring(low, high + 1));
            low--;
            high++;
        }
        return result;
    }
}