package com.core.string;


import java.util.Arrays;
public class SortStringLength {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] str = {"umbrella", "apple", "baby", "cat", "rat", "obnoxious"};
        Arrays.stream(str).sorted((e1,e2)->e1.length()-e2.length()).forEach(System.out::println);
    }
}
