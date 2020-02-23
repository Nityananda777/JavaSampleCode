package com.core.string;

import java.util.*;

class PalindromeSequence {

    public static void main(String[] args) {
        String str = "babad";
        System.out.println(findPalindrome(str));

    }

    public static String findPalindrome(String A){
        char [] chars = A.toCharArray();  //Convery string to character array..
        int [][]LP = new int[chars.length][chars.length];
        //LP[i][j] - length of palindrome from ith index to jth index
        // all the characters in the string are palindrome by itself of length 1.
        //So all LP[i][i] =  1
        for(int i=0;i<chars.length;i++){
            LP[i][i] = 1;
        }
        for(int sublen = 2;sublen<=chars.length;sublen++){
            for(int i=0;i<=LP.length-sublen;i++){
                int j = i+sublen-1;
                if(chars[i]==chars[j] && sublen==2){
                    LP[i][j] = 2;
                }
                else if(chars[i]==chars[j]){
                    LP[i][j] = LP[i+1][j-1]+2;
                }
                else{
                    LP[i][j] = Math.max(LP[i+1][j],LP[i][j-1]);
                }
            }
        }


        return String.valueOf(LP[0][LP.length-1]);

    }
}
